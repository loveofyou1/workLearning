package com.main.learn.threads.artOfThread.thread03;

/**
 * 非线程安全的延迟初始化
 *
 * @author sunlei19
 * @create 2018/8/23
 */
public class UnsafeLazyInitialize {

    private static Instance instance;


    /**
     * 非线程安全的延迟初始化
     *
     * @return
     */
    public static Instance getInstance() {
        if (instance == null) {
            instance = new Instance();
        }
        return instance;
    }


    /**
     * 线程安全的延迟初始化，但是会导致性能降低
     *
     * @return
     */
    public static synchronized Instance getSynchronizedInstance() {
        if (instance == null) {
            instance = new Instance();
        }
        return instance;
    }
}
