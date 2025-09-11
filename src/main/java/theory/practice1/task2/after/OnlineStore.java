package theory.practice1.task2.after;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private List<Order> orders = new ArrayList<>();
    private PaymentService paymentService;
    private DiscountStrategy discountStrategy;
    private BulkOrderStrategy bulkOrderStrategy;

    public OnlineStore(PaymentService paymentService, DiscountStrategy discountStrategy, BulkOrderStrategy bulkOrderStrategy) {
        this.paymentService = paymentService;
        this.discountStrategy = discountStrategy;
        this.bulkOrderStrategy = bulkOrderStrategy;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    private List<Product> getActualProductList(List<Product> productList) {
        List<Product> actualProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isInStock()) {
                actualProductList.add(product);
            }
        }
        return actualProductList;
    }

    public void processOrders() {
        for (Order order : orders) {
            System.out.println("### Start processing Order: " + order.getNumber() + " ###");

            // Шаг 1: сформировать список товаров в наличии
            System.out.println("Start preparing actual product list for Order: " + order.getNumber());

            // Шаг 2: обновляем заказ актуальным списком товаров в наличии
            List<Product> actualProductList = getActualProductList(order.getProductList());
            order.setProductList(actualProductList);
            System.out.println("Actual list for Order " + order.getNumber());
            order.printProductList();

            if (actualProductList.isEmpty()) {
                System.out.println("Order does not have actual products");
            } else {
                // Шаг 3: вычисляем скидку на основании общей цены
                System.out.println("Start calculating discount for Order: " + order.getNumber());
                double finalPrice = discountStrategy.applyDiscount(order.calculateTotalPrice());
                order.setTotalPrice(finalPrice);
                System.out.println("Final price for Order: " + order.getNumber() + " is " + finalPrice);

                // Шаг 4: отправка запроса на покупку оптом
                System.out.println("Start preparing actual product list for Order: " + order.getNumber());
                bulkOrderStrategy.createBulkOrder(order);
                System.out.println("Bulk order checked for Order: " + order.getNumber());
            }

            System.out.println("### Stop processing Order: " + order.getNumber() + " ###");
            System.out.println();
        }
    }
}