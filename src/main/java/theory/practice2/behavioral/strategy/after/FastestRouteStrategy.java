package theory.practice2.behavioral.strategy.after;

public class FastestRouteStrategy implements RouteStrategy{
    @Override
    public void buildRoute() {
        System.out.println("Building the fastest route.");
    }
}
