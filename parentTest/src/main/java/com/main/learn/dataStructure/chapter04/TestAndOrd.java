package com.main.learn.dataStructure.chapter04;

/**
 * @author sunlei19
 * @create 2018/12/25
 */
public class TestAndOrd {
    public static void main(String[] args) {
        int test = 10;
        System.out.println(test << 1);
        System.out.println(test >> 1);
        System.out.println(test >> 3);

        System.out.println(test & 2);
        System.out.println(test >>> 2);
        System.out.println(test | 2);
        System.out.println(~test);
        System.out.println(test ^ 2);//异或时第n个数据不同时为1
    }
}
