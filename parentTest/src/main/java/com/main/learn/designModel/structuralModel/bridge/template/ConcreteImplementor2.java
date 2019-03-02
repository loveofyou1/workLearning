package com.main.learn.designModel.structuralModel.bridge.template;

public class ConcreteImplementor2 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("实现化2做一些事情");
    }

    @Override
    public void doAnything() {
        System.out.println("实现化2做任何事情");
    }
}
