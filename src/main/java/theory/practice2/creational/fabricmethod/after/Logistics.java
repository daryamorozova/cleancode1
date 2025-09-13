package theory.practice2.creational.fabricmethod.after;

/**
 * Класс для управления логистикой доставок
 */
public abstract class Logistics {
    // фабричным методом
    // метод реализует способ создания транспорта
    abstract Transport createTransport();

    public void planDeleivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
