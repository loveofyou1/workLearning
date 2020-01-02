package com.main.learn.threads.exercise.core.two.object;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/29 14:40
 */
public class ThreadA extends Thread {

    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
