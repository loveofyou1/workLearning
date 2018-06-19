package com.main.test.normal.exceptionTest;

import java.util.Date;

public class TestException {
    public static void main(String[] args) {
     /*   int total = 100;
        try {
            int sum = total / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("catch到异常没有抛出，然后走到了这！");*/
        System.out.println(new Date(Long.valueOf(1000)));
    }
}
