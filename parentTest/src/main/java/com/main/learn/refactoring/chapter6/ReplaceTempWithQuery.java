package com.main.learn.refactoring.chapter6;

public class ReplaceTempWithQuery {
    private static int _quantity = 1000;
    private static int _itemPrices = 5;

    private static double getPrice() {
        int basePrice = _quantity * _itemPrices;
        double discountFactory;
        if (basePrice > 1000) {
            discountFactory = 0.95;
        } else {
            discountFactory = 0.98;
        }
        return basePrice * discountFactory;
    }


    // =====================================
    // 重构后方法

    private static double getNewPrice() {
        return getBasePrice() * getDiscountFactory();
    }

    private static int getBasePrice() {
        return _quantity * _itemPrices;
    }
    
    private static double getDiscountFactory() {
        if (getBasePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }


    public static void main(String[] args) {
        System.out.println(getPrice());
    }
}
