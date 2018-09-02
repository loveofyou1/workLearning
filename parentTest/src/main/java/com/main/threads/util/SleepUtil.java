package com.main.threads.util;

import java.util.concurrent.TimeUnit;

public class SleepUtil {

    public static void sleep(long timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
