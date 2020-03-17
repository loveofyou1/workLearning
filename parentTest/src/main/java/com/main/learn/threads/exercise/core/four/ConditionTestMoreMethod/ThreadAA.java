package com.main.learn.threads.exercise.core.four.ConditionTestMoreMethod;

/**
 * @author sunlei19
 * @date 2020/1/2
 */
public class ThreadAA extends Thread {
    private MyService myService = new MyService();

    public ThreadAA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
