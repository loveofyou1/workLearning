package com.main.learn.threads.exercise.core.three.pc;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:42
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
