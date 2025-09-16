package practice.complexTasks.task1;

public class UUIDShorteningStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String longUrl) {
        return "shortened_url_using_UUID";
    }
}
