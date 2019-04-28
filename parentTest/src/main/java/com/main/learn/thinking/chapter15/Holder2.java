package com.main.learn.thinking.chapter15;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Holder2 {
    private Object object;

    public Holder2(Object obj) {
        this.object = obj;
    }

    public void set(Object o) {
        this.object = o;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new AutoMobile());
        AutoMobile autoMobile = (AutoMobile) holder2.get();
        holder2.set("Not an Automobile");
        String s = (String) holder2.get();
        System.out.println(s);
        holder2.set(1);
        Integer x = (Integer) holder2.get();
        System.out.println(x);
    }
}
