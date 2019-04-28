package com.main.learn.thinking.chapter15.genericMethod;

/**
 * 方法泛型化
 *
 * @author sunlei19
 * @create 2019/4/28
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(" ");
        genericMethods.f(1);
        genericMethods.f(1.0);
        genericMethods.f(1.0F);
        genericMethods.f('c');
        genericMethods.f(genericMethods);
    }
}
