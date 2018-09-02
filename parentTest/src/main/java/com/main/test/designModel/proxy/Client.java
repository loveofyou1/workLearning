package com.main.test.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author sunlei19
 * @create 2018-03-05 10:17
 */
public class Client {
    public static void main(String args[]) {
        RealSubject realSubject = new RealSubject();
        InvocationHandler ds = new DynamicSubject(realSubject);
        Class clazz = realSubject.getClass();

        //以下是一次性生成代理
        Subject subject = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), ds);
        subject.request();

    }
}
