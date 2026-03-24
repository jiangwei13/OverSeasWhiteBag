package top.niunaijun.blackobfuscator.core;

import org.gradle.api.logging.Logger;
import org.jf.baksmali.Adaptors.ClassDefinition;
import org.jf.baksmali.BaksmaliOptions;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedClassDef;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.writer.builder.DexBuilder;
import org.jf.dexlib2.writer.io.FileDataStore;
import org.jf.smali.Smali;
import org.jf.smali.SmaliOptions;
import org.jf.util.IndentingWriter;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 安全的 dex 合并工具，替代 DexLib2Utils.mergerAndCoverDexFile。
 * 所有类（混淆类 + 原始类）均通过 smali 往返转换规范化，
 * 避免 dexlib2 DexWriter 写入时因 R8 产物或混淆后的无效 debug info 地址崩溃。
 * 同时提供逐类错误定位能力。
 */
public class SafeDexMerger {

    /**
     * 将混淆后的 dex (obfDex) 合并回原始 dex (mainDex)，输出到 outDex。
     * 混淆后的类优先；所有类均通过 smali 往返转换规范化。
     * 失败的类记录日志并回退到直接 intern。
     *
     * @return 成功合并的混淆类数量（>0 表示至少部分成功，-1 表示整体失败）
     */
    public static int merge(File mainDex, File obfDex, File outDex, Logger logger) {
        try {
            DexBackedDexFile mainFile = loadDex(mainDex);
            DexBackedDexFile obfFile = loadDex(obfDex);

            DexBuilder builder = new DexBuilder(Opcodes.getDefault());
            Set<String> inserted = new HashSet<>();
            List<String> failedClasses = new ArrayList<>();
            int obfClassCount = 0;

            // 1. 添加混淆后的类，通过 smali 往返转换规范化（去除 debug info）
            for (DexBackedClassDef def : obfFile.getClasses()) {
                String className = def.getType();
                try {
                    String smali = classToSmali(def);
                    Smali.assembleSmaliFile(smali, builder, new SmaliOptions());
                    inserted.add(className);
                    obfClassCount++;
                } catch (Throwable e) {
                    String dottedName = ObfDex.toDottedName(className);
                    failedClasses.add(dottedName);
                    logger.warn("BlackObfuscator: smali round-trip failed for obfuscated class [{}]: {}",
                            dottedName, e.getMessage());
                }
            }

            // 2. 添加原始 dex 中的其余类（未被混淆的 + 混淆失败回退的）
            //    同样通过 smali 往返转换，避免 R8 产物的 debug info 在 dexlib2 写入时越界
            for (DexBackedClassDef def : mainFile.getClasses()) {
                if (inserted.contains(def.getType())) {
                    continue;
                }
                String className = def.getType();
                try {
                    String smali = classToSmali(def);
                    Smali.assembleSmaliFile(smali, builder, new SmaliOptions());
                    inserted.add(className);
                } catch (Throwable e) {
                    // smali 往返失败，回退到直接 intern 并记录
                    String dottedName = ObfDex.toDottedName(className);
                    failedClasses.add(dottedName);
                    logger.warn("BlackObfuscator: smali round-trip failed for original class [{}]: {}",
                            dottedName, e.getMessage());
                    builder.internClassDef(def);
                    inserted.add(className);
                }
            }

            // 3. 写入
            File parent = outDex.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            FileDataStore dataStore = new FileDataStore(outDex);
            builder.writeTo(dataStore);

            if (!failedClasses.isEmpty()) {
                logger.warn("BlackObfuscator: {} classes fell back to unobfuscated: {}",
                        failedClasses.size(), failedClasses);
            }
            return obfClassCount;
        } catch (Throwable e) {
            logger.error("SafeDexMerger.merge failed", e);
            return -1;
        }
    }

    private static String classToSmali(DexBackedClassDef classDef) throws Exception {
        BaksmaliOptions options = new BaksmaliOptions();
        // 不输出 debug info（.line / .local），从源头消除无效地址引用
        options.registerInfo = 0;
        options.debugInfo = false;
        ClassDefinition classDefinition = new ClassDefinition(options, classDef);
        StringWriter writer = new StringWriter();
        IndentingWriter indentingWriter = new IndentingWriter(writer);
        classDefinition.writeTo(indentingWriter);
        return writer.toString();
    }

    private static DexBackedDexFile loadDex(File file) throws Exception {
        return DexBackedDexFile.fromInputStream(
                Opcodes.getDefault(),
                new java.io.BufferedInputStream(new java.io.FileInputStream(file))
        );
    }
}
