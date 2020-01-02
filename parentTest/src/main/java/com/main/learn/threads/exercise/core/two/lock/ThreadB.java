package com.main.learn.threads.exercise.core.two.lock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 17:39
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum privateNum;

    public ThreadB(HasSelfPrivateNum selfPrivateNum) {
        super();
        this.privateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        privateNum.add("b");
    }
}
