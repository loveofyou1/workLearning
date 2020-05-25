package com.main.learn.refactoring.chapter10;

public class ReplaceParameterWithMethods {

    private static int quantity = 10;
    private static int itemPrice = 5;

    public static void main(String[] args) {
        System.out.println(getPrice());
    }

    private static double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private static int getBasePrice() {
        return quantity * itemPrice;
    }


    private static int getDiscountLevel() {
        if (quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }

}
