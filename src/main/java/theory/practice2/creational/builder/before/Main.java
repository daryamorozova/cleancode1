package theory.practice2.creational.builder.before;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick", "tomato", "pepperoni");

        // Правила синтаксиса Java при создании объектов:
        // строгий порядок параметров метода (конструктора)
        // запрет на пропуск параметра

        // Pizza pizza = new Pizza("tomato", "pepperoni");

        System.out.println(pizza);
    }
}
