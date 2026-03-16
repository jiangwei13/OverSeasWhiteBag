package top.niunaijun.blackobfuscator.core;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mapping {
    private final File file;
    private final Map<String, String> mapping = new LinkedHashMap<>();

    public Mapping(File file) {
        this.file = file;
        parse();
    }

    public Map<String, String> getMapping() {
        return Collections.unmodifiableMap(mapping);
    }

    private void parse() {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines) {
                String trimmed = line == null ? "" : line.trim();
                if (trimmed.isEmpty() || trimmed.startsWith("#") || trimmed.endsWith(":")) {
                    continue;
                }
                int arrowIndex = trimmed.indexOf("->");
                if (arrowIndex < 0) {
                    continue;
                }
                String from = trimmed.substring(0, arrowIndex).trim();
                String to = trimmed.substring(arrowIndex + 2).trim();
                if (to.endsWith(":")) {
                    to = to.substring(0, to.length() - 1).trim();
                }
                if (!from.isEmpty() && !to.isEmpty()) {
                    mapping.put(from, to);
                }
            }
        } catch (IOException ignored) {
        }
    }
}
