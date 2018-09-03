package com.main.test.normal.reflect.proxy;

import com.main.test.normal.reflect.Advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleProxy implements InvocationHandler {

    private Object obj;
    private Advice advice;

    //绑定代理对象
    public Object bind(Object obj, Advice advice) {
        this.obj = obj;
        this.advice = advice;

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            this.advice.before();
            result = method.invoke(this.obj, args);
            this.advice.after();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
