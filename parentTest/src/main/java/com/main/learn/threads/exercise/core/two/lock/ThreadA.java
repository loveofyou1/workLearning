package com.main.learn.threads.exercise.core.two.lock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 17:37
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum selfPrivateNum;

    public ThreadA(HasSelfPrivateNum selfPrivateNum) {
        super();
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        selfPrivateNum.add("a");
    }
}
