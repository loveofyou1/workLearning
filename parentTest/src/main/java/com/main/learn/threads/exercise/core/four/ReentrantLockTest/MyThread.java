package com.main.learn.threads.exercise.core.four.ReentrantLockTest;

/**
 * @author sunlei19
 * @date 2020/1/2
 */
public class MyThread extends Thread {

    private MyService myService = new MyService();

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
