package com.main.threads.concurrencyPractice.chapter4;

import com.sun.webpane.webkit.WCWidget;
import net.jcip.annotations.GuardedBy;

/**
 * @author sunlei19
 * @create 2018-03-16 20:35
 */
public class PrivateLock {
    private final Object myLock = new Object();
    @GuardedBy("myLock")
    WCWidget widget;
    void someMethod() {
        synchronized (myLock) {
            //访问或修改widget状态
        }
    }
}
