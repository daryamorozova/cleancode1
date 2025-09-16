package practice.complexTasks.task1;

public class ShortenerFactory {
    public static ShorteningStrategy createShorteningStrategy(String strategy) {
        switch (strategy) {
            case "Base62":
                return new Base62ShorteningStrategy();
            case "Hash":
                return new HashShorteningStrategy();
            case "UUID":
                return new UUIDShorteningStrategy();
            default:
                throw new IllegalArgumentException("Unknown shortening strategy: " + strategy);
        }
    }
}