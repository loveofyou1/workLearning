package com.main.learn.threads.exercise.core.two.inner;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/30 15:00
 */
public class RunOutClass {
    public static void main(String[] args) {
        final OutClass.InnerClass innerClass = new OutClass.InnerClass();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.method1();
            }
        }, "A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.method2();
            }
        }, "B");

        t1.start();
        t2.start();
    }
}
