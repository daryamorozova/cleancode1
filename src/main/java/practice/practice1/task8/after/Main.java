package practice.practice1.task8.after;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSendler = new EmailSender();

        NotificationService notificationService = new NotificationService(emailSendler);
        notificationService.sendNotification("Привет");

    }
}
