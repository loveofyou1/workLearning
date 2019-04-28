package com.main.learn.thinking.chapter15.bound;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class ColorDimension2<T extends Dimension & HasColor> extends Color2<T> {

    ColorDimension2(T item) {
        super(item);
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
}
