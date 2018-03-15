package com.main.threads.artOfThread.threadArt01;

import java.util.concurrent.TimeUnit;

/**
 * @author sunlei19
 * @create 2018-02-02 16:33
 */
public class Profiler {
    //第一次get()方法调用时会进行初始化（如果set方法没有调用），每个线程会调用一次
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>() {
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static final void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final Long end() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Cost:" + Profiler.end() + " mills");
    }
}
