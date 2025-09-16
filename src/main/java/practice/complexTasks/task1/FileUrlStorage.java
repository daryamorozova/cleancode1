package practice.complexTasks.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUrlStorage implements UrlStorage {
    private static FileUrlStorage instance;
    private final Path filePath;
    private final Map<String, String> storage = new HashMap<>();

    private FileUrlStorage(String filePath) {
        this.filePath = Paths.get(filePath);
        loadFromFile();
    }

    public static FileUrlStorage getInstance(String filePath) {
        if (instance == null) {
            instance = new FileUrlStorage(filePath);
        }
        return instance;
    }

    @Override
    public void save(String longUrl, String shortUrl) {
        storage.put(longUrl, shortUrl);
        saveToFile();
    }

    @Override
    public String getShortUrl(String longUrl) {
        return storage.get(longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
        for (Map.Entry<String, String> entry : storage.entrySet()) {
            if (entry.getValue().equals(shortUrl)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private void loadFromFile() {
        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(line -> {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    storage.put(parts[0], parts[1]);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() {
        try {
            Files.write(filePath, storage.entrySet().stream()
                    .map(entry -> (entry.getKey() + ":" + entry.getValue()))
                    .collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}