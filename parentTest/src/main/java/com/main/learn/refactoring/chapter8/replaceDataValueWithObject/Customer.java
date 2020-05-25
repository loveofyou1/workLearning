package com.main.learn.refactoring.chapter8.replaceDataValueWithObject;

import com.google.common.collect.Maps;

import java.util.Map;

public class Customer {

    private static Map<String, Customer> instances = Maps.newHashMap();

    static void loadCustomers() {
        new Customer("lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private String name;

    private Customer(String name) {
        this.name = name;
    }

    public static Customer getNamed(String name) {
        return instances.get(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void store() {
        instances.put(this.getName(), this);
    }
}
