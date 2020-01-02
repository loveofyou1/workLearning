package com.main.learn.threads.exercise.core.two.atomic;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/31 09:20
 */
public class MyThread extends Thread{

    private MyService myService = new MyService();

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
       myService.addNum();
    }
}
