package com.main.learn.effective.six;

import java.util.EnumSet;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/17 21:43
 */
public class TestEnum {

    public static void main(String[] args) {
        EnumSet<EnumSetTest> setTests = EnumSet.of(EnumSetTest.APPLE);
        System.out.println(setTests);
    }
}
