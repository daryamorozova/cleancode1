package theory.practice1.task2.after;

public class TotalCostDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        double finalPrice = totalPrice;
        if (totalPrice > 500) {
            finalPrice = totalPrice * 0.9;
            System.out.println("This order qualifies for a 10% discount next time!");
        } else {
            System.out.println("This order does not qualify for a 10% discount :(");
        }
        return finalPrice;
    }
}
