package com.main.learn.threads.exercise.core.three.size5;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:43
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThreadA myThreadA = new MyThreadA(lock);
            myThreadA.start();

            Thread.sleep(50);

            MyThreadB myThreadB = new MyThreadB(lock);
            myThreadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
