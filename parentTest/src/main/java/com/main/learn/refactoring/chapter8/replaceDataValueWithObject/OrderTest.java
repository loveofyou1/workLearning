package com.main.learn.refactoring.chapter8.replaceDataValueWithObject;

import java.util.Collection;
import java.util.Iterator;

public class OrderTest {

    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order each = (Order) iterator.next();
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
