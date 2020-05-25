package com.main.learn.refactoring.chapter8.replaceDataValueWithObject;

/**
 * 以对象取代数据值
 * Order中的字段customer改为对象Customer
 */
public class Order {

    private Customer customer;


    public Order(String customerName) {
        this.customer = Customer.getNamed(customerName);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }
}
