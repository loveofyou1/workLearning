package com.main.learn.thinking.chapter15.bound;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class InneritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        solid2.getColor();
        solid2.getY();
        solid2.weight();
    }
}
