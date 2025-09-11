package practice.practice1.task8.after;

public class EmailSender implements Sendler {
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка email: " + message);
    }
}
