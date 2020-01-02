package com.main.learn.threads.exercise.core.three.notifyLock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:21
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock =new Object();

            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(1000);

            ThreadB threadB = new ThreadB(lock);
            threadB.start();

            SynNotifyThread synNotifyThread = new SynNotifyThread(lock);
            synNotifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
