package com.main.learn.designModel.structuralModel.bridge.template;

/**
 * 具体实现化角色
 */
public class ConcreteImplementor1 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("具体角色做一些事情");
    }

    @Override
    public void doAnything() {
        System.out.println("具体角色做任何事情");
    }
}
