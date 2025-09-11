package practice.practice1.task6.after;

/*
6. Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов
Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.
 */

public class Bird implements Flyable {
    public void fly() {
        System.out.println("Птица летит");
    }
}
