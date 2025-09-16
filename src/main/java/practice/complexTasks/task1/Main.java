package practice.complexTasks.task1;

/**
 * Разработка библиотеки для сокращения URL
 * Цель: Разработать библиотеку, которая предоставляет функциональность для сокращения длинных URL
 * и их восстановления.
 * Библиотека должна быть гибкой, чтобы в будущем можно было легко добавлять новые методы сокращения.
 * <p>
 * Паттерны проектирования:
 * Singleton: Единственное хранилище всех URL.
 * Factory Method: Для создания объектов, отвечающих за различные методы сокращения URL.
 * Strategy: Для переключения между способами сокращения URL.
 * <p>
 * Архитектура библиотеки:
 * UrlShortenerService: Класс, отвечающий за логику сокращения и восстановления URL.
 * UrlStorage: Интерфейс для хранения пар "длинный URL - короткий URL", с различными реализациями
 * (например, память, файлы, базы данных).
 * ShorteningStrategy: Интерфейс, который определяет метод для сокращения URL.
 * Реализации могут включать Base62, хеширование, UUID и другие.
 * ShortenerFactory: Класс, использующий Factory Method для создания объектов ShorteningStrategy.
 * <p>
 * Пример использования:
 * * // Конфигурация библиотеки с выбранной стратегией сокращения
 * UrlShortenerService shortenerService = new UrlShortenerService(new
 * ShortenerFactory(new Base62Strategy() ));
 * <p>
 * // Сокращение URL
 * String shortUrl =
 * shortenerService. shortenUrl("https://example.com/very/long/url");
 * System.out.println("Short URL: " + shortUrl);
 * <p>
 * // Восстановление URL
 * String longUrl = shortenerService.expandUrl(shortUrl);
 * System.out.println("Original URL: " + longUrl);
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Memory Storage with Base62 Strategy ===");
        UrlStorage memoryStorage = MemoryUrlStorage.getInstance();
        ShorteningStrategy base62Strategy = ShortenerFactory.createShorteningStrategy("Base62");
        UrlShortenerService memoryService = new UrlShortenerService(memoryStorage, base62Strategy);

        demonstrateUrlShortening(memoryService, "https://example.com/very/long/url");

        // Пример использования FileUrlStorage (Singleton) с Hash стратегией
        System.out.println("\n=== File Storage with Hash Strategy ===");
        UrlStorage fileStorage = FileUrlStorage.getInstance("urls.txt");
        ShorteningStrategy hashStrategy = ShortenerFactory.createShorteningStrategy("Hash");
        UrlShortenerService fileService = new UrlShortenerService(fileStorage, hashStrategy);

        demonstrateUrlShortening(fileService, "https://anotherexample.com/some/other/long/url");

        // Демонстрация невозможности создания нового экземпляра Singleton
        System.out.println("\n=== Singleton Instance Verification ===");
        UrlStorage anotherMemoryStorage = MemoryUrlStorage.getInstance();
        if (memoryStorage == anotherMemoryStorage) {
            System.out.println("MemoryUrlStorage is Singleton: both instances are the same.");
        }

        UrlStorage anotherFileStorage = FileUrlStorage.getInstance("urls.txt");
        if (fileStorage == anotherFileStorage) {
            System.out.println("FileUrlStorage is Singleton: both instances are the same.");
        }

    }

    private static void demonstrateUrlShortening(UrlShortenerService service, String longUrl) {
        String shortUrl = service.shortenUrl(longUrl);
        System.out.println("LongUrl: " + longUrl);
        System.out.println("ShortUrl: " + shortUrl);

        String restoredLongUrl = service.restoreUrl(shortUrl);
        System.out.println("RestoredLongUrl: " + restoredLongUrl);
    }


}
