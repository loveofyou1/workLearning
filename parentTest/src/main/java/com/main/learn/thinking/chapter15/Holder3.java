package com.main.learn.thinking.chapter15;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<AutoMobile> holder3 = new Holder3<>(new AutoMobile());
        holder3.get();
        System.out.println(holder3.get());
    }
}
