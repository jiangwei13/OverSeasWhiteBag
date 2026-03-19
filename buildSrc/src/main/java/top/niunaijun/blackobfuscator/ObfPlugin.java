package top.niunaijun.blackobfuscator;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.logging.Logger;
import top.niunaijun.blackobfuscator.core.ObfDex;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class ObfPlugin implements Plugin<Project> {
    private static final Set<String> ATTACHED_TASKS = ConcurrentHashMap.newKeySet();
    private static final Set<String> PROCESSED_OUTPUTS = ConcurrentHashMap.newKeySet();
    private static final Pattern TARGET_TASK_NAME = Pattern.compile(
        "^(mergeDex.+|mergeProjectDex.+|mergeLibDex.+|transformDexArchiveWithDexMergerFor.+|minify.+WithR8)$"
    );

    @Override
    public void apply(Project project) {
        BlackObfuscatorExtension extension = project.getExtensions()
            .create("BlackObfuscator", BlackObfuscatorExtension.class, project);

        project.afterEvaluate(ignored -> {
            if (!extension.isEnabled()) {
                return;
            }
            if (!project.getPlugins().hasPlugin("com.android.application")) {
                project.getLogger().warn("BlackObfuscator skipped: com.android.application not found in {}", project.getPath());
                return;
            }
            ATTACHED_TASKS.clear();
            PROCESSED_OUTPUTS.clear();
            logHeader(project.getLogger(), extension);
            attachTasks(project, extension);
        });
    }

    private void attachTasks(Project project, BlackObfuscatorExtension extension) {
        project.getTasks().configureEach(task -> {
            if (!TARGET_TASK_NAME.matcher(task.getName()).matches()) {
                return;
            }
            if (!ATTACHED_TASKS.add(task.getPath())) {
                return;
            }
            task.doLast(currentTask -> processTaskOutputs(project, currentTask, extension));
        });
    }

    private void processTaskOutputs(Project project, Task task, BlackObfuscatorExtension extension) {
        Logger logger = project.getLogger();
        File reportFile = new File(project.getBuildDir(), "outputs/blackobfuscator/" + task.getName() + ".txt");
        resetReport(reportFile);
        appendReport(reportFile, "task=" + task.getPath());
        appendReport(reportFile, "mappingFile=" + (extension.getMappingFile() == null ? "<none>" : extension.getMappingFile().getAbsolutePath()));
        appendReport(reportFile, "obfClass=" + Arrays.toString(extension.getObfClass()));
        appendReport(reportFile, "blackClass=" + Arrays.toString(extension.getBlackClass()));
        for (File output : task.getOutputs().getFiles().getFiles()) {
            if (output == null || !output.exists()) {
                continue;
            }
            String outputKey = canonicalPath(output);
            if (!PROCESSED_OUTPUTS.add(outputKey)) {
                continue;
            }
            logger.lifecycle("BlackObfuscator processing {} from {}", output.getAbsolutePath(), task.getPath());
            ObfDex.obf(output.getAbsolutePath(), extension, reportFile, logger);
        }
    }

    private void logHeader(Logger logger, BlackObfuscatorExtension extension) {
        logger.lifecycle("=====BlackObfuscator=====");
        logger.lifecycle(extension.toString());
        logger.lifecycle("=========================");
    }

    private static void resetReport(File reportFile) {
        File parent = reportFile.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }
        try {
            Files.write(reportFile.toPath(), new byte[0], StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ignored) {
        }
    }

    private static void appendReport(File reportFile, String line) {
        try {
            Files.write(
                reportFile.toPath(),
                (line + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
        } catch (IOException ignored) {
        }
    }

    private static String canonicalPath(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException ignored) {
            return file.getAbsolutePath();
        }
    }
}
