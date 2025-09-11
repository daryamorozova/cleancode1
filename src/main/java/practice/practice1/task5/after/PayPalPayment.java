package practice.practice1.task5.after;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Оплата PayPal на сумму " + amount);
    }
}
