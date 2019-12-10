package com.main.learn.effective.nineteen;

import java.time.Instant;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/9 21:01
 */
public class Sub extends Super {

    private final Instant instant;

    public Sub() {
        this.instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
