package com.main.test.annotation.main;

import com.main.test.annotation.MyAnno;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/9/29 09:39
 */
@MyAnno
public class TestMyAnno {
    private int test = 0;
    public static void main(String[] args) {
        System.out.printf("hello annotation");
    }
}
