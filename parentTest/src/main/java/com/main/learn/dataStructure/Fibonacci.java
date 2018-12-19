package com.main.learn.dataStructure;

/**
 * @author sunlei19
 * @create 2018/12/17
 */
public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    private static void fibonacci(long n) {
        int[] a = new int[(int) n + 1];
        for (int i = 1; i <= n; i++) {
            if (i < 3) {
                a[i] = 1;
                System.out.print(" " + 1);
            } else {
                a[i] = a[i - 1] + a[i - 2];
                System.out.print(" " + a[i]);
            }
        }
    }
}
