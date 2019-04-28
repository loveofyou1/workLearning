package com.main.learn.thinking.chapter15.bound;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}
