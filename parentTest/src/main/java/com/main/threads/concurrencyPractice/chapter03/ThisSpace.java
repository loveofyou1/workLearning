package com.main.threads.concurrencyPractice.chapter03;

import java.awt.*;
import java.util.EventListener;

/**
 * @author sunlei19
 * @create 2018-03-15 20:30
 */
public class ThisSpace {
    public ThisSpace(EventSource source) {
        source.registerListener(new EventListener() {
            public void onEvent(Event e) {
                e.toString();
                //隐式的使用this，this引用逸出，不要这么做
                this.getClass();
            }
        });
    }
}

class EventSource {
    public void registerListener(EventListener eventListener) {
    }
}