package practice.practice1.task8.after;

/*
8. Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов
Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
 */

public class NotificationService {
    private Sendler sender;

    public NotificationService(Sendler sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.sendMessage(message);
    }
}
