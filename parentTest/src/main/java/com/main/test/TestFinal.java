package com.main.test;

/**
 * @author sunlei19
 * @create 2018-03-13 10:53
 */
public class TestFinal {
    public static void main(String[] args) {
        final int count;
        int i = 2;
        Integer j = 3;
        if (i == 1) {
            count = i;
        } else {
            count = i*j;
        }
        System.out.println(count);
    }
}
