package practice.practice1.task4.after;

public class EmailNotificationService {

    public void sendEmailConfirmation(Order order) {
        System.out.println("Отправляем письмо клиенту о заказе № " + order.getOrderId());
    }
}
