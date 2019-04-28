package com.main.learn.thinking.chapter15.bound;

import java.awt.*;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}
