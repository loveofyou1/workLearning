package com.main.learn.threads.artOfThread.threadArt01;

public class Synchronized {
    public static void main(String[] args) {
        //对Synchronized的class对象加锁
        synchronized (Synchronized.class) {

        }
        m();
    }

    public static synchronized void m() {

    }
}
