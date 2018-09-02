package com.main.impl;

import com.main.service.ParentInterface;

public abstract class AbstractParent implements ParentInterface {
    public String sayHello() {
        System.out.println("parentHello");
        return "Parenthello";
    }
}
