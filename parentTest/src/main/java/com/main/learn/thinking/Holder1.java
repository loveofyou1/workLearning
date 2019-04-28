package com.main.learn.thinking;

import com.main.learn.thinking.chapter15.AutoMobile;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Holder1 {
    private AutoMobile a;

    public Holder1(AutoMobile a) {
        this.a = a;
    }

    public AutoMobile get() {
        return a;
    }
}
