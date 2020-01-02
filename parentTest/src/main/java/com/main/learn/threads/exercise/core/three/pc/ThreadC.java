package com.main.learn.threads.exercise.core.three.pc;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:43
 */
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
