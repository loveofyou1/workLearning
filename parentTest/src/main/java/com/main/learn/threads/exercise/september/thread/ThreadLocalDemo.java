package com.main.learn.threads.exercise.september.thread;

/**
 * @author sunlei19
 * @Description ThreadLocal保证变量在同一个线程中不变
 * @Date 2019/10/6 17:32
 */
public class ThreadLocalDemo {
    public final static ThreadLocal<String> threadLocal = new ThreadLocal();

    public static void setThreadLocal(String local) {
        threadLocal.set(local);
    }

    public static String getThreadLocal() {
        return threadLocal.get();
    }
}
