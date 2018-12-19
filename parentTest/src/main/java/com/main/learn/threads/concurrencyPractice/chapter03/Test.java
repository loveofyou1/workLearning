package com.main.learn.threads.concurrencyPractice.chapter03;

/**
 * @author sunlei19
 * @create 2018-03-16 10:45
 */
public class Test {
    public static void main(String[] args) {
        ThreeStooges stooges = new ThreeStooges();
        System.out.println(stooges.isStooge("Moe"));
    }
}
