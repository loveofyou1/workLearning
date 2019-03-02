package com.main.learn.designModel.structuralModel.proxy.dynamicTemplate;

import java.lang.reflect.InvocationHandler;

public class Client1 {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = (Subject) DynamicProxy.newProxyInstance(subject.getClass().
                getClassLoader(), subject.getClass().getInterfaces(), handler);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
