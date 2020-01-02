package com.main.learn.threads.exercise.core;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 13:12
 */
public class ResumeThread extends Thread {

    @Override
    public void run() {
        System.out.println("测试线程" + "-" + Thread.currentThread().getName());
    }
}
