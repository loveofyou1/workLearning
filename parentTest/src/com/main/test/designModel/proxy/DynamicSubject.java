package com.main.test.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sunlei19
 * @create 2018-03-05 10:14
 */
public class DynamicSubject implements InvocationHandler {

    private Object sub;

    public DynamicSubject() {

    }

    public DynamicSubject(Object object) {
        this.sub = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" before calling " + method);
        method.invoke(sub, args);
        System.out.println(" after calling " + method);
        return null;
    }
}
