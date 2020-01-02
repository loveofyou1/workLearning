package com.main.learn.threads.exercise.core.three;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:21
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 myThread1 = new MyThread1(lock);
            myThread1.start();
            Thread.sleep(3000);
           /* MyThread2 myThread2 = new MyThread2(lock);
            myThread2.start();*/

           Object lock2 = new Object();
           MyThread3 myThread3 = new MyThread3(lock2);
           myThread3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
