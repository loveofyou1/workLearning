package com.main.learn.threads.exercise.september.thread;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/6 17:19
 */
public class DemoThread implements Runnable {

    private long time;

    public DemoThread(long time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(time + " is a test time.");
        System.out.println(ThreadLocalDemo.getThreadLocal());
    }
}
