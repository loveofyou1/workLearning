package com.main.learn.thinking.chapter15;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Holder4<T> {

    private T test;

    public Holder4(T t) {
        this.test = t;
    }

    public T get() {
        return test;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Holder4<GenericService> holder4 = new Holder4<>(new GenericServiceImpl1());
        GenericService genericService1 = holder4.get();
        genericService1.execute();

        Holder4<GenericService> holder41 = new Holder4<>(new GenericServiceImpl2());
        holder41.get().execute();
    }
}
