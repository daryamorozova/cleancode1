package theory.practice2.behavioral.strategy.before;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator("fastest");
        navigator.buildRoute();
    }
}
