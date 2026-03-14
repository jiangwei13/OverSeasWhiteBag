package top.niunaijun.blackobfuscator.core;

import com.googlecode.dex2jar.tools.Dex2jarCmd;
import com.googlecode.dex2jar.tools.Jar2Dex;
import org.gradle.api.logging.Logger;
import org.jf.DexLib2Utils;
import top.niunaijun.blackobfuscator.BlackObfuscatorExtension;
import top.niunaijun.obfuscator.ObfuscatorConfiguration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ObfDex {
    private ObfDex() {
    }

    public static void obf(String path, BlackObfuscatorExtension extension, File reportFile, Logger logger) {
        File file = new File(path);
        if (!file.exists()) {
            return;
        }
        Mapping mapping = new Mapping(extension.getMappingFile());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null) {
                return;
            }
            for (File child : files) {
                obf(child.getAbsolutePath(), extension, reportFile, logger);
            }
            return;
        }
        handleDex(file, extension, mapping, reportFile, logger);
    }

    private static void handleDex(File input, BlackObfuscatorExtension extension, Mapping mapping, File reportFile, Logger logger) {
        if (!input.getAbsolutePath().endsWith(".dex")) {
            return;
        }

        File tempJar = null;
        File splitDex = null;
        File obfDex = null;
        try {
            tempJar = new File(input.getParentFile(), System.currentTimeMillis() + "-obf-" + input.getName() + ".jar");
            splitDex = new File(input.getParentFile(), System.currentTimeMillis() + "-split-" + input.getName());
            obfDex = new File(input.getParentFile(), System.currentTimeMillis() + "-rebuild-" + input.getName());

            List<String> obfClassList = expandPrefixes(extension.getObfClass(), mapping.getMapping());
            List<String> blackClassList = expandPrefixes(extension.getBlackClass(), mapping.getMapping());
            long selectedClassCount = DexLib2Utils.splitDex(input, splitDex, obfClassList, blackClassList);
            if (selectedClassCount <= 0) {
                appendReport(reportFile, Arrays.asList(
                    "input=" + input.getAbsolutePath(),
                    "selectedClassCount=0"
                ));
                return;
            }

            KotlinDexFilter.FilterResult filterResult = KotlinDexFilter.inspect(splitDex, extension);
            appendReport(reportFile, Arrays.asList(
                "input=" + input.getAbsolutePath(),
                "selectedClassCount=" + selectedClassCount,
                "expandedObfClass=" + obfClassList,
                "expandedBlackClass=" + blackClassList
            ));
            appendReport(reportFile, filterResult.buildReportLines());
            if (filterResult.getEligibleMethodCount() <= 0) {
                logger.lifecycle("BlackObfuscator skipped {}: no eligible methods after Kotlin/static-init filters", input.getAbsolutePath());
                return;
            }

            KotlinDexFilter.FilterResult finalFilterResult = filterResult;
            new Dex2jarCmd(new ObfuscatorConfiguration() {
                @Override
                public int getObfDepth() {
                    return extension.getDepth();
                }

                @Override
                public boolean accept(String className, String methodName) {
                    if (extension.isSkipStaticInitializer() && "<clinit>".equals(methodName)) {
                        return false;
                    }
                    return !finalFilterResult.shouldSkipClass(className) && !finalFilterResult.shouldSkipMethod(className, methodName);
                }
            }).doMain("-f", splitDex.getAbsolutePath(), "-o", tempJar.getAbsolutePath());

            new Jar2Dex().doMain("-f", "-o", obfDex.getAbsolutePath(), tempJar.getAbsolutePath());
            DexLib2Utils.mergerAndCoverDexFile(input, obfDex, input);
        } catch (Throwable throwable) {
            appendReport(reportFile, Arrays.asList(
                "input=" + input.getAbsolutePath(),
                "error=" + throwable
            ));
            logger.error("BlackObfuscator failed for {}", input.getAbsolutePath(), throwable);
        } finally {
            deleteQuietly(tempJar);
            deleteQuietly(splitDex);
            deleteQuietly(obfDex);
        }
    }

    static String toDottedName(String className) {
        if (className == null || className.isEmpty()) {
            return className;
        }
        if (className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';') {
            return className.substring(1, className.length() - 1).replace('/', '.');
        }
        return className.replace('/', '.');
    }

    private static List<String> expandPrefixes(String[] prefixes, Map<String, String> mapping) {
        Set<String> expanded = new LinkedHashSet<>();
        expanded.addAll(Arrays.asList(prefixes));
        for (Map.Entry<String, String> entry : mapping.entrySet()) {
            if (matchesAnyPrefix(entry.getKey(), expanded) || matchesAnyPrefix(entry.getValue(), expanded)) {
                expanded.add(entry.getKey());
                expanded.add(entry.getValue());
            }
        }
        expanded.removeIf(value -> value == null || value.trim().isEmpty());
        return new ArrayList<>(expanded);
    }

    private static boolean matchesAnyPrefix(String candidate, Set<String> prefixes) {
        String normalizedCandidate = toDottedName(candidate);
        for (String prefix : prefixes) {
            if (prefix == null) {
                continue;
            }
            String trimmed = prefix.trim();
            if (!trimmed.isEmpty() && normalizedCandidate.startsWith(trimmed)) {
                return true;
            }
        }
        return false;
    }

    private static void appendReport(File reportFile, List<String> lines) {
        if (reportFile == null) {
            return;
        }
        try {
            Files.write(reportFile.toPath(), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ignored) {
        }
    }

    private static void deleteQuietly(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }
}
