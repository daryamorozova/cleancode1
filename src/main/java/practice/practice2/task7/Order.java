package practice.practice2.task7;

//добавляя товары, указывая скидку и выбирая способ оплаты.

public class Order {
    private String item;
    private String discount;
    private String strategyPayment;

    public Order(String item, String discount, String strategyPayment) {
        this.item = item;
        this.discount = discount;
        this.strategyPayment = strategyPayment;
    }

    public Order(Builder builder){
        this.item = builder.item;
        this.discount = builder.discount;
        this.strategyPayment = builder.strategyPayment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", discount='" + discount + '\'' +
                ", strategyPayment='" + strategyPayment + '\'' +
                '}';
    }

    static class Builder {
        private String item;
        private String discount;
        private String strategyPayment;


        public Builder setItem(String item) {
            this.item = item;
            return this;
        }

        public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
        }

        public Builder setStrategyPayment(String strategyPayment) {
            this.strategyPayment = strategyPayment;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
