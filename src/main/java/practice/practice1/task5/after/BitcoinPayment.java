package practice.practice1.task5.after;

public class BitcoinPayment implements PaymentStrategy{
    @Override
    public void process(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
