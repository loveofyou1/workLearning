package com.main.impl;

public class Child extends AbstractParent {
    @Override
    public String sayHello() {
        System.out.println("childHello");
        return "childHello";
    }
}
