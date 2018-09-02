package com.main.threads.concurrencyPractice.chapter03;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunlei19
 * @create 2018-03-16 14:16
 */
public class Holder {
    private int n;

    public Holder(int n) {
        this.n = n;
    }

    public void assertSanity() {
        if (n != n) {
            throw new AssertionError("this statement is false.");
        }
    }

    //Date的值放入Map后就不会改变，使用同步方法的同步机制就能保证Date值安全的发布出去
    public Map<String, Date> lastLogin = Collections.synchronizedMap(new HashMap<String, Date>());
}
