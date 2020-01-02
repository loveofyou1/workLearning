package com.main.learn.threads.exercise.core.two.object;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/28 11:52
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadNmae=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end entTime=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB() {
        try {
            System.out.println("begin methodB threadName = " + Thread.currentThread().getName() + "begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
