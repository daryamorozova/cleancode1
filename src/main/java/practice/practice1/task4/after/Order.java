package practice.practice1.task4.after;

public class Order {
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void processOrder() {
        System.out.println("Обрабатываем заказ № " + orderId);
    }
}
