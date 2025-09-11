package theory.practice1.task2.after;

public class Product {
    private String name;
    private double price;
    private boolean isInStock;
    private int quantity;

    public Product(String name, double price, int quantity, boolean isInStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isInStock = isInStock;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isInStock() {
        return isInStock;
    }
}
