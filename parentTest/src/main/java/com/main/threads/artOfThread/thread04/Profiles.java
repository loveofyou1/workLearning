package com.main.threads.artOfThread.thread04;

import java.util.concurrent.TimeUnit;

/**
 * threadlocal类使用
 *
 * @author Dean
 * @create 2018/9/3
 */
public class Profiles {
    private static final ThreadLocal<Long> TIME_THREADLOCAL = ThreadLocal.withInitial(() -> System.currentTimeMillis());


    public static final void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }


    public static final Long end() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }


    public static void main(String[] args) throws Exception {
        Profiles.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Cost:" + Profiles.end() + " millis");
    }
}
