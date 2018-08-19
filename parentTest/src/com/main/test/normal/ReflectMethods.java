package com.main.test.normal;

public class ReflectMethods {

    public static int hello = 0;

    public static final String FIELD_ONE = "1";


    public void method1() {
        System.out.println("method1");

    }

    public void method2() {
        System.out.println("method2");
    }

    public ReflectMethods(int hello) {
        this.hello = hello;
    }

    public ReflectMethods() {

    }
}
