package top.niunaijun.blackobfuscator;

import org.gradle.api.Project;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BlackObfuscatorExtension {
    private final Project project;
    private boolean enabled;
    private int depth = 1;
    private String[] obfClass = new String[0];
    private String[] blackClass = new String[0];
    private File mappingFile;
    private boolean skipStaticInitializer = true;
    private boolean skipKotlinSynthetic = true;
    private boolean skipKotlinSingletonLikeClasses = true;

    public BlackObfuscatorExtension(Project project) {
        this.project = project;
        this.mappingFile = project.file("xml-class-mapping.txt");
    }

    public boolean getEnabled() {
        return enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void enabled(boolean enabled) {
        setEnabled(enabled);
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void depth(int depth) {
        setDepth(depth);
    }

    public String[] getObfClass() {
        return obfClass.clone();
    }

    public void setObfClass(String... obfClass) {
        this.obfClass = sanitize(obfClass);
    }

    public void setObfClass(List<?> obfClass) {
        this.obfClass = sanitize(obfClass);
    }

    public void obfClass(String... obfClass) {
        setObfClass(obfClass);
    }

    public void obfClass(List<?> obfClass) {
        setObfClass(obfClass);
    }

    public String[] getBlackClass() {
        return blackClass.clone();
    }

    public void setBlackClass(String... blackClass) {
        this.blackClass = sanitize(blackClass);
    }

    public void setBlackClass(List<?> blackClass) {
        this.blackClass = sanitize(blackClass);
    }

    public void blackClass(String... blackClass) {
        setBlackClass(blackClass);
    }

    public void blackClass(List<?> blackClass) {
        setBlackClass(blackClass);
    }

    public File getMappingFile() {
        return mappingFile;
    }

    public void setMappingFile(Object mappingFile) {
        this.mappingFile = mappingFile == null ? null : project.file(mappingFile);
    }

    public void mappingFile(Object mappingFile) {
        setMappingFile(mappingFile);
    }

    public boolean getSkipStaticInitializer() {
        return skipStaticInitializer;
    }

    public boolean isSkipStaticInitializer() {
        return skipStaticInitializer;
    }

    public void setSkipStaticInitializer(boolean skipStaticInitializer) {
        this.skipStaticInitializer = skipStaticInitializer;
    }

    public void skipStaticInitializer(boolean skipStaticInitializer) {
        setSkipStaticInitializer(skipStaticInitializer);
    }

    public boolean getSkipKotlinSynthetic() {
        return skipKotlinSynthetic;
    }

    public boolean isSkipKotlinSynthetic() {
        return skipKotlinSynthetic;
    }

    public void setSkipKotlinSynthetic(boolean skipKotlinSynthetic) {
        this.skipKotlinSynthetic = skipKotlinSynthetic;
    }

    public void skipKotlinSynthetic(boolean skipKotlinSynthetic) {
        setSkipKotlinSynthetic(skipKotlinSynthetic);
    }

    public boolean getSkipKotlinSingletonLikeClasses() {
        return skipKotlinSingletonLikeClasses;
    }

    public boolean isSkipKotlinSingletonLikeClasses() {
        return skipKotlinSingletonLikeClasses;
    }

    public void setSkipKotlinSingletonLikeClasses(boolean skipKotlinSingletonLikeClasses) {
        this.skipKotlinSingletonLikeClasses = skipKotlinSingletonLikeClasses;
    }

    public void skipKotlinSingletonLikeClasses(boolean skipKotlinSingletonLikeClasses) {
        setSkipKotlinSingletonLikeClasses(skipKotlinSingletonLikeClasses);
    }

    @Override
    public String toString() {
        return "BlackObfuscatorExtension{" +
            "enabled=" + enabled +
            ", depth=" + depth +
            ", mappingFile=" + mappingFile +
            ", skipStaticInitializer=" + skipStaticInitializer +
            ", skipKotlinSynthetic=" + skipKotlinSynthetic +
            ", skipKotlinSingletonLikeClasses=" + skipKotlinSingletonLikeClasses +
            ", obfClassCount=" + obfClass.length +
            ", blackClassCount=" + blackClass.length +
            '}';
    }

    private static String[] sanitize(String... values) {
        List<String> sanitized = new ArrayList<>();
        if (values != null) {
            for (String value : values) {
                if (value == null) {
                    continue;
                }
                String trimmed = value.trim();
                if (!trimmed.isEmpty()) {
                    sanitized.add(trimmed);
                }
            }
        }
        return sanitized.toArray(new String[0]);
    }

    private static String[] sanitize(List<?> values) {
        List<String> sanitized = new ArrayList<>();
        if (values != null) {
            for (Object value : values) {
                if (value == null) {
                    continue;
                }
                String trimmed = value.toString().trim();
                if (!trimmed.isEmpty()) {
                    sanitized.add(trimmed);
                }
            }
        }
        return sanitized.toArray(new String[0]);
    }
}
