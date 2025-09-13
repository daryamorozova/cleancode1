package theory.practice2.creational.builder.after;

class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, " + topping + " topping.";
    }

    static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        /*
        Если вы используете классические сеттеры, то:

        Pizza pizza = new Pizza.Builder();
        pizza.setDough();
        pizza.setSauce();
        pizza.setTopping();

        Использовать цепочку вызовов:

        new Pizza.Builder() // возвращался тип данных Builder
           .setDough() // возвращался тип данных Builder
           .setSauce() // возвращался тип данных Builder
           .setTopping(); // возвращался тип данных Builder

         */

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}


