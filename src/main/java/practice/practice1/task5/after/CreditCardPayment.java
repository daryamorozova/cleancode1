package practice.practice1.task5.after;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
