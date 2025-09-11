package practice.practice1.task3.before;

/*
3. Нарушение YAGNI (You Ain't Gonna Need It) – ненужный код
Задача: Удалите неиспользуемые поля и оставьте только необходимые данные.
 */

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isPremiumMember;
    private int rewardPoints;
    private String preferredLanguage;
    private String homeAddress;
    private String workAddress;
    private String socialSecurityNumber; // Никогда не используется
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
