package com.main.learn.threads.exercise.core.one;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 13:41
 */
public class Run {
    public static void main(String[] args) {
       /* MyThread thread = new MyThread();
        thread.start();*/
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            myThread1.start();

            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);
            myThread2.start();
        }

    }
}
