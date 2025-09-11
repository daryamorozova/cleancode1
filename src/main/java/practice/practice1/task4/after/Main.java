package practice.practice1.task4.after;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(345);
        order.processOrder();

        EmailNotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.sendEmailConfirmation(order);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.generateInvoice(order);

    }
}
