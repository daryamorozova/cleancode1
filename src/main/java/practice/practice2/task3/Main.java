package practice.practice2.task3;

/**
 * Реализовать фабричный метод транспортных средств (Автомобиль, Велосипед)
 * Описание
 * В этом приложении нам нужно создать систему для создания различных типов транспортных средств
 * (например, автомобили и велосипеды). Вместо того чтобы код зависел от конкретных классов (например, Car и Bicycle),
 * мы будем использовать фабричный метод для создания объектов.
 * Это позволит расширять систему, добавляя новые типы транспортных средств, не меняя существующий код.
 */

public class Main {
    public static void main(String[] args) {
        String transportType = "Car";

        // Используем тернарный оператор для гарантированной инициализации
        TransportFactory factory = transportType.equals("Bicycle")
                ? new BicycleFactory()
                : new CarFactory();

        // Создаем транспорт через фабрику
        Transport transport = factory.createTransport();
        transport.ride();
    }
}