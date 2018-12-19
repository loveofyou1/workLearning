package com.main.learn.threads.artOfThread.thread06;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author sunlei
 */
public class TestConcurrentMap {
    public static void main(String[] args) {
        final HashMap<String, String> map = new HashMap<>(2);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Thread(()->{
                   map.put(UUID.randomUUID().toString()," ");
                },"ftf" + i).start();
            }
        },"ftf");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
