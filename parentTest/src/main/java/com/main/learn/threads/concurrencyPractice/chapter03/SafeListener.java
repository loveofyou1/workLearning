package com.main.learn.threads.concurrencyPractice.chapter03;

import java.awt.*;
import java.util.EventListener;

/**
 * @author sunlei19
 * @create 2018-03-15 20:38
 */
public class SafeListener {
    private final EventListener listener;

    private SafeListener() {
        listener = new EventListener() {
            public void onEvent(Event event) {
                System.out.println(event.getClass());
            }
        };
    }

    public static SafeListener newInstance(EventSource source) {
        SafeListener safeListener = new SafeListener();
        source.registerListener(safeListener.listener);
        return safeListener;
    }
}
