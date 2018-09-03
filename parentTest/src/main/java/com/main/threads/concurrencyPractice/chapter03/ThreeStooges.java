package com.main.threads.concurrencyPractice.chapter03;

import java.util.HashSet;
import java.util.Set;

/**
 * 通过构造方法来保证final域的不变性
 *
 * @author sunlei19
 * @create 2018-03-16 10:42
 */
public class ThreeStooges {
    private final Set<String> stooges = new HashSet<>();

    public ThreeStooges() {
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }
}
