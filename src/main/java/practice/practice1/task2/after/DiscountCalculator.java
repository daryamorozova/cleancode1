package practice.practice1.task2.after;

/*
2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код
Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
 */

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
 double discountRate = 0.0;
        final double LOYAL_FIRST_PURCHASE_DISCOUNT = 0.10;
        final double LOYAL_CUSTOMER_DISCOUNT = 0.05;
        final double COUPON_DISCOUNT = 0.07;
        final double REGULAR_DISCOUNT = 0.02;

        if (isLoyalCustomer){
            discountRate = isFirstPurchase ? LOYAL_FIRST_PURCHASE_DISCOUNT : LOYAL_CUSTOMER_DISCOUNT;
        } else {
            discountRate = hasCoupon ? COUPON_DISCOUNT : REGULAR_DISCOUNT;
        }
        return price - price * discountRate;
    }

    }
