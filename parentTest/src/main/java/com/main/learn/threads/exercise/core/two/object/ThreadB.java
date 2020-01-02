package com.main.learn.threads.exercise.core.two.object;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/29 14:41
 */
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject object) {
        super();
        this.myObject = object;
    }

    @Override
    public void run() {
        super.run();
        this.myObject.methodB();
    }
}
