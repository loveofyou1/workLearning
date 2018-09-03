package com.main.test.designModel.proxy;

/**
 * @author sunlei19
 * @create 2018-03-05 10:13
 */
public class RealSubject implements Subject {

    public RealSubject() {
    }

    @Override
    public void request() {
        System.out.println(" from real subject! ");
    }
}
