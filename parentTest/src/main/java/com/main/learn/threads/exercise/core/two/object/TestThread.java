package com.main.learn.threads.exercise.core.two.object;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/29 14:42
 */
public class TestThread {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();

        ThreadA a = new ThreadA(myObject);
        a.setName("A");

        ThreadB b = new ThreadB(myObject);
        b.setName("B");

        a.start();
        b.start();
    }
}
