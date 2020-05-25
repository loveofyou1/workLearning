package com.main.learn.refactoring.chapter6;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {

    private final String _name = "sun";

    Vector<Order> _orders = new Vector<>();

    public ExtractMethod(Vector _orders) {
        this._orders = _orders;
    }

    void printOwing(double previousAmout) {

        printBanner();

        double outstanding = getOutstanding(previousAmout * 1.2);

        // print detail
        printDetail(outstanding);
    }

    private double getOutstanding(double initialValue) {
        double result = initialValue;
        Enumeration e = _orders.elements();
        // calculate outestanding
        while (e.hasMoreElements()) {
            Order order = (Order) e.nextElement();
            result += order.getAmount();
        }
        return result;
    }

    private void printDetail(double outstanding) {
        System.out.println("name:" + _name);
        System.out.println("amount:" + outstanding);
    }

    private void printBanner() {
        System.out.println("***************************");
        System.out.println("******Customer Owes********");
        System.out.println("***************************");
    }


    class Order {
        int orderId;
        String orderName;
        int amount;

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getOrderName() {
            return orderName;
        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
