package com.main.learn.effective.twenty;

import java.util.*;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/9 22:00
 */
public class TestAbstractClass {
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldVal = a[index];
                a[index] = element;
                return oldVal;
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }

    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        AbstractMap.SimpleEntry<String, String> simpleEntry = new AbstractMap.SimpleEntry<String, String>("1", "one");
        System.out.println(simpleEntry.toString());
    }
}
