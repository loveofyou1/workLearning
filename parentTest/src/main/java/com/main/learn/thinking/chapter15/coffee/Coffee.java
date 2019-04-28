package com.main.learn.thinking.chapter15.coffee;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
