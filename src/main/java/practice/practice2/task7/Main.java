package practice.practice2.task7;

/**
 * Реализовать строитель для создания заказов в интернет-магазине
 * Описание
 * В интернет-магазине клиент может оформить заказ, добавляя товары,
 * указывая скидку и выбирая способ оплаты.
 * Паттерн Builder поможет организовать процесс формирования заказа,
 * не перегружая конструктор класса Order множеством параметров. Это позволяет строить объекты заказов поэтапно,
 * добавляя товары, скидки и способы оплаты по мере необходимости.
 */

public class Main {
    public static void main(String[] args) {
        Order order = new Order("laptop", "10%", "CreditCard");

        Order orderFlex = new Order.Builder()
                .setItem("phone")
                .setStrategyPayment("CreditCard")
                .build();

        System.out.println(order);
        System.out.println(orderFlex);
    }
}
