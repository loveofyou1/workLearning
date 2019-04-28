package com.main.learn.thinking.chapter15.bound;

import java.awt.*;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Color2<T extends HasColor> extends HoldItem<T> {

    Color2(T item) {
        super(item);
    }

    Color getColor() {
        return item.getColor();
    }
}
