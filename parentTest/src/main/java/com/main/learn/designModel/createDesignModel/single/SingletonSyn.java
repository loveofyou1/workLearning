package com.main.learn.designModel.createDesignModel.single;

/**
 * 懒汉式
 * 线程安全的，效率较低，不常用
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class SingletonSyn {
    private static SingletonSyn instance;

    private SingletonSyn() {

    }

    public static synchronized SingletonSyn getInstance() {
        if (instance == null) {
            instance = new SingletonSyn();
        }
        return instance;
    }
}
