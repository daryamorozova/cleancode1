package practice.complexTasks.task1;

public class HashShorteningStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String longUrl) {
        return "shortened_url_using_hash";
    }
}
