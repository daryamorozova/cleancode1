package practice.complexTasks.task1;

import java.util.HashMap;
import java.util.Map;

public class MemoryUrlStorage implements UrlStorage {
    private static MemoryUrlStorage instance;
    private final Map<String, String> storage = new HashMap<>();

    private MemoryUrlStorage() {
    }

    public static MemoryUrlStorage getInstance() {
        if (instance == null) {
            instance = new MemoryUrlStorage();
        }
        return instance;
    }

    @Override
    public void save(String longUrl, String shortUrl) {
        storage.put(longUrl, shortUrl);
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
}