package com.main.designModel.single;

/**
 * 懒汉式
 * 线程不安全
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public Singleton getInstance() {
        //lazy初始化
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
