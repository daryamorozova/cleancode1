package practice.practice2.task11;

/**
 * Фасад для управления дверью (открыть, закрыть, заблокировать)
 * Описание
 * В нашей системе есть несколько операций для управления дверью:
 * - Открытие двери.
 * - Закрытие двери.
 * - Блокировка двери.
 * Каждая операция реализована в своём классе. Задача — создать фасад, который будет
 * объединять эти операции и предоставлять простой интерфейс для работы с дверью.
 */

public class Main {
    public static void main(String[] args) {
        DoorOpener doorOpener = new DoorOpener();
        DoorCloser doorCloser = new DoorCloser();
        DoorBlocker doorBlocker = new DoorBlocker();

        DoorFacade doorFacade = new DoorFacade(doorOpener, doorCloser, doorBlocker);
        doorFacade.interactDoor();
    }
}
