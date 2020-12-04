package com.main.learn.threads.exercise.september.thread;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/6 17:49
 */
public class ThreadLocalTest {

    public void test() {
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalDemo.getThreadLocal());
    }
}
