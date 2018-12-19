package com.main.learn.dataStructure;

/**
 * @author sunlei19
 * @create 2018/12/17
 */
public class Gcd {
    public static void main(String[] args) {
        long result = gcd(1989, 1590);
        System.out.printf(String.valueOf(result));
    }

    private static long gcd(long m, long n) {
        while (n != 0) {
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }
}
