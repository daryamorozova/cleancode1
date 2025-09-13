package theory.practice2.structural.decorator.before;

public class Main {
    public static void main(String[] args) {
        CoffeeWithMilkAndSugar coffee = new CoffeeWithMilkAndSugar();
        System.out.println("Cost: $" + coffee.cost());

        /*
        Если завтра мы начнем расширение коффейни и у нас добавится 100 топпингов:

        Создать классы для всех возможных комбинций топинга между собой:

        Пример: у нас есть сироп с миндалем, карамелью и шоколадом

        кофе с минадлем
        кофе с миндалем и карамелью
        кофе с миндалем и шоколадом
        кофе с миндалем карамелью и шоколадом

        количество комбинаторных комбинаций будет расти расти и расти
         */
    }
}
