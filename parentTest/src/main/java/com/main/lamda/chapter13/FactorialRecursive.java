package com.main.lamda.chapter13;

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
    }

    private static long factorialRecursive(long n) {
        return n == 1 ? 1 : n * factorialRecursive(n - 1);
    }
}
