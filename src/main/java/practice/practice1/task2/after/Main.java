package practice.practice1.task2.after;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println(calculator.calculateDiscount(10, true, true, true));
        System.out.println(calculator.calculateDiscount(10, true, false, true));
        System.out.println(calculator.calculateDiscount(10, false, false, true));
        System.out.println(calculator.calculateDiscount(10, false, false, false));

    }
}
