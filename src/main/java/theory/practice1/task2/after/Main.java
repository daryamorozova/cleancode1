package theory.practice1.task2.after;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new SimplePaymentService();
        DiscountStrategy discountStrategy = new TotalCostDiscount();
        BulkOrderStrategy bulkOrderStrategy = new LaptopBulkOrderStrategy();

        OnlineStore onlineStore = new OnlineStore(paymentService, discountStrategy, bulkOrderStrategy);

        // Order 1
        List<Product> productList1 = new ArrayList<>();
        productList1.add(new Product("Laptop", 1200, 1, true));
        Order order1 = new Order(productList1, "John Doe", true);

        // Order 2
        List<Product> productList2 = new ArrayList<>();
        productList2.add(new Product("Smartphone", 800, 2, false));
        Order order2 = new Order(productList2, "Alice Smith", true);

        // Order 3
        List<Product> productList3 = new ArrayList<>();
        productList3.add(new Product("Laptop", 1200, 5, true));
        Order order3 = new Order(productList3, "Bob Johnson", true);

        onlineStore.addOrder(order1);
        onlineStore.addOrder(order2);
        onlineStore.addOrder(order3);

        onlineStore.processOrders();
    }
}
