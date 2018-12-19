package com.main.learn.threads.concurrencyPractice.chapter15;

import net.jcip.annotations.ThreadSafe;

import java.util.HashMap;
import java.util.Map;

/**
 * 不可变对象初始化安全性
 */
@ThreadSafe
public class SafeStates {
    private final Map<String, String> states;

    public SafeStates() {
        states = new HashMap<>();
        states.put("alaska", "AK");
        states.put("alabama", "AL");
        states.put("wyoming", "WY");
    }

    public String getAttribution(String s) {
        return states.get(s);
    }
}
