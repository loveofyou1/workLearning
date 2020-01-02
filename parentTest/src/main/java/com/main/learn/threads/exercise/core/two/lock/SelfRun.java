package com.main.learn.threads.exercise.core.two.lock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 17:41
 */
public class SelfRun {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum1= new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();

        ThreadB threadB = new ThreadB(hasSelfPrivateNum1);
        threadB.start();
    }
}
