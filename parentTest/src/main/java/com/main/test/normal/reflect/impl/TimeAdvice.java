package com.main.test.normal.reflect.impl;

import com.main.test.normal.reflect.Advice;

public class TimeAdvice implements Advice {
    long startTime;
    long endTime;

    @Override
    public void before() {
        startTime = System.nanoTime(); // 获取开始时间
    }

    @Override
    public void after() {
        endTime = System.nanoTime(); // 获取结束时间
    }
}
