package top.niunaijun.blackobfuscator.core;

import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import top.niunaijun.blackobfuscator.BlackObfuscatorExtension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

final class KotlinDexFilter {
    private static final String KOTLIN_METADATA = "Lkotlin/Metadata;";

    private KotlinDexFilter() {
    }

    static FilterResult inspect(File dexFile, BlackObfuscatorExtension extension) {
        if (dexFile == null || !dexFile.exists()) {
            return FilterResult.empty();
        }
        try {
            Set<String> skippedClasses = new LinkedHashSet<>();
            Set<String> skippedMethods = new LinkedHashSet<>();
            List<String> reasons = new ArrayList<>();
            int eligibleMethodCount = 0;

            for (ClassDef classDef : DexFileFactory.loadDexFile(dexFile, Opcodes.getDefault()).getClasses()) {
                String descriptorName = classDef.getType();
                String dottedName = ObfDex.toDottedName(descriptorName);
                boolean isKotlinClass = hasKotlinMetadata(classDef);

                if (shouldSkipClass(classDef, isKotlinClass, extension)) {
                    skippedClasses.add(descriptorName);
                    skippedClasses.add(dottedName);
                    reasons.add("skipClass " + dottedName);
                    continue;
                }

                for (Method method : classDef.getMethods()) {
                    if (shouldSkipMethod(method, isKotlinClass, extension)) {
                        skippedMethods.add(descriptorName + "#" + method.getName());
                        skippedMethods.add(dottedName + "#" + method.getName());
                        reasons.add("skipMethod " + dottedName + "#" + method.getName());
                        continue;
                    }
                    eligibleMethodCount++;
                }
            }

            return new FilterResult(skippedClasses, skippedMethods, reasons, eligibleMethodCount);
        } catch (IOException ignored) {
            return FilterResult.empty();
        }
    }

    private static boolean shouldSkipClass(ClassDef classDef, boolean isKotlinClass, BlackObfuscatorExtension extension) {
        String descriptorName = classDef.getType();
        if (extension.isSkipKotlinSingletonLikeClasses() && isKotlinClass) {
            if (descriptorName.contains("$Companion;")
                || descriptorName.contains("$DefaultImpls;")
                || descriptorName.contains("$WhenMappings;")
                || descriptorName.endsWith("Kt$WhenMappings;")
                || hasInstanceField(classDef)
                || AccessFlags.SYNTHETIC.isSet(classDef.getAccessFlags())) {
                return true;
            }
        }
        if (extension.isSkipKotlinSynthetic() && isKotlinClass && AccessFlags.SYNTHETIC.isSet(classDef.getAccessFlags())) {
            return true;
        }
        return false;
    }

    private static boolean shouldSkipMethod(Method method, boolean isKotlinClass, BlackObfuscatorExtension extension) {
        String methodName = method.getName();
        if (extension.isSkipStaticInitializer() && "<clinit>".equals(methodName)) {
            return true;
        }
        if (!extension.isSkipKotlinSynthetic() || !isKotlinClass) {
            return false;
        }
        return AccessFlags.SYNTHETIC.isSet(method.getAccessFlags())
            || AccessFlags.BRIDGE.isSet(method.getAccessFlags())
            || methodName.contains("$default")
            || methodName.startsWith("access$");
    }

    private static boolean hasKotlinMetadata(ClassDef classDef) {
        for (Annotation annotation : classDef.getAnnotations()) {
            if (KOTLIN_METADATA.equals(annotation.getType())) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasInstanceField(ClassDef classDef) {
        for (Field field : classDef.getStaticFields()) {
            if ("INSTANCE".equals(field.getName())
                && AccessFlags.STATIC.isSet(field.getAccessFlags())
                && classDef.getType().equals(field.getType())) {
                return true;
            }
        }
        return false;
    }

    static final class FilterResult {
        private final Set<String> skippedClasses;
        private final Set<String> skippedMethods;
        private final List<String> reasons;
        private final int eligibleMethodCount;

        private FilterResult(Set<String> skippedClasses, Set<String> skippedMethods, List<String> reasons, int eligibleMethodCount) {
            this.skippedClasses = skippedClasses;
            this.skippedMethods = skippedMethods;
            this.reasons = reasons;
            this.eligibleMethodCount = eligibleMethodCount;
        }

        static FilterResult empty() {
            return new FilterResult(Collections.emptySet(), Collections.emptySet(), Collections.emptyList(), 0);
        }

        boolean shouldSkipClass(String className) {
            return skippedClasses.contains(className);
        }

        boolean shouldSkipMethod(String className, String methodName) {
            return skippedMethods.contains(className + "#" + methodName);
        }

        int getEligibleMethodCount() {
            return eligibleMethodCount;
        }

        List<String> buildReportLines() {
            List<String> lines = new ArrayList<>();
            lines.add("eligibleMethodCount=" + eligibleMethodCount);
            lines.add("skippedClassCount=" + skippedClasses.size());
            lines.add("skippedMethodCount=" + skippedMethods.size());
            int limit = Math.min(reasons.size(), 120);
            for (int i = 0; i < limit; i++) {
                lines.add(reasons.get(i));
            }
            if (reasons.size() > limit) {
                lines.add("... truncated " + (reasons.size() - limit) + " more entries");
            }
            return lines;
        }
    }
}
