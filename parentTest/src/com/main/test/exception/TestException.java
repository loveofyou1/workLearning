package com.main.test.exception;

public class TestException {
    public static void main(String[] args) {

        try {
            int i = 10;
            int j = i / 0;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("catch错误输出" + e);
        }finally {
            System.out.println("finally错误输出");
        }
    }
}
