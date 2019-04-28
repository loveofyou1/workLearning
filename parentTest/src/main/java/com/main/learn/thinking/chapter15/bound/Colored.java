package com.main.learn.thinking.chapter15.bound;

import java.awt.*;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    //the bound allows you to call a method
    Color color() {
        return item.getColor();
    }
}
