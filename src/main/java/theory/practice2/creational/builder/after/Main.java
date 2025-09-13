package theory.practice2.creational.builder.after;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick", "tomato", "pepperoni");

        Pizza flexiblePizza = new Pizza.Builder()
                .setSauce("tomato")
                .setTopping("pepperoni")
                .build();

        System.out.println(pizza);

        System.out.println(flexiblePizza);
    }
}
