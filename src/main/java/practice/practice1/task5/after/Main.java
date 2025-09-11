package practice.practice1.task5.after;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CreditCard", 100.50);
        processor.processPayment("PayPal", 75.25);
        processor.processPayment("Bitcoin", 0.005);
        
    }
}
