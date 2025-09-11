package practice.practice1.task5.after;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {

    private Map<String, PaymentStrategy> strategis;

    public PaymentProcessor() {
        strategis = new HashMap<>();
        strategis.put("CreditCard", new CreditCardPayment());
        strategis.put("PayPal", new PayPalPayment());
        strategis.put("Bitcoin", new BitcoinPayment());
    }

    public void processPayment(String paymentType, double amount) {
        PaymentStrategy strategy = strategis.get(paymentType);
        if (strategy == null) {
            throw new IllegalArgumentException("Неизвестный тип оплаты " + paymentType);
        }
        strategy.process(amount);
    }
}
