package com.main.test;

/**
 * @author sunlei19
 * @create 2018-02-03 18:31
 */
class Value {
    int v;

    public Value(int v) {
        this.v = v;
    }
}

public class FinalTest {

    final int f1 = 1;
    final int f2;

    public FinalTest() {
        f2 = 2;
    }

    public static void main(String[] args) {
        final int value1 = 1;
        // value1 = 4;
        final double value2;
        value2 = 2.0;
        final Value value3 = new Value(1);
        value3.v = 4;
        System.out.println(value3.toString());
        value3.v = 5;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3.v);
        System.out.println(value3.toString());
    }
}