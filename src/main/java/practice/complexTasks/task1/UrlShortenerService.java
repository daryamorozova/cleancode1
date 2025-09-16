package practice.complexTasks.task1;

// класс, отвечающий за логику сокращения и восстановления URL

public class UrlShortenerService {
    private final UrlStorage urlStorage;
    private final ShorteningStrategy shorteningStrategy;

    public UrlShortenerService(UrlStorage urlStorage, ShorteningStrategy shorteningStrategy) {
        this.urlStorage = urlStorage;
        this.shorteningStrategy = shorteningStrategy;
    }

    public String shortenUrl(String longUrl) {
        String shortUrl = shorteningStrategy.shorten(longUrl);
        urlStorage.save(longUrl, shortUrl);
        return shortUrl;
    }

    public String restoreUrl(String shortUrl) {
        return urlStorage.getLongUrl(shortUrl);
    }
}
