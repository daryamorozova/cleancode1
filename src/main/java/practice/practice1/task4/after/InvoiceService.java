package practice.practice1.task4.after;

public class InvoiceService {
    public void generateInvoice(Order order) {
        System.out.println("Генерируем счет для заказа № " + order.getOrderId());
    }
}
