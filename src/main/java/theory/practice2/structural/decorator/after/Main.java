package theory.practice2.structural.decorator.after;

public class Main {
    public static void main(String[] args) {
        /*
        Идея решения:

        Давайте сделаем: простой кофе

        И реализуем декораторы (слои для добавления к кофе):
        Декоратор молока
        Декоратор сахара

        Использование:
        1) цель: сделать кофе с молоком

        беру простой кофе
        декорирую (добавление нового слоя) простой кофе молоком -> кофе с молоком

        2) цель: сделать кофе с сахаром

        беру простой кофе
        декорирую (добавление нового слоя) простой кофе сахаром -> кофе с сахаром

        3) цель: кофе с молоком и сахаром

        беру простой кофе
        декорирую простой кофе молоком -> кофе с молоком
        декорирую простой кофе молоком и сахаром -> кофе с молоком и сахаром

         */


        //  1) цель: сделать кофе с молоком
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.cost());

        // 2) цель: сделать кофе с сахаром
        Coffee coffeeWithSugar = new SimpleCoffee();
        coffeeWithSugar = new SugarDecorator(coffeeWithSugar);
        System.out.println(coffeeWithSugar.cost());

        // 3) цель: кофе с молоком и сахаром
        Coffee coffeeWithSugarAndMilk = new SimpleCoffee(); // простой кофе
        coffeeWithSugarAndMilk = new SugarDecorator(coffeeWithSugarAndMilk); // простой кофе + сахар
        coffeeWithSugarAndMilk = new MilkDecorator(coffeeWithSugarAndMilk); // простой кофе + сахар + молоко
        System.out.println(coffeeWithSugarAndMilk.cost());
    }
}
