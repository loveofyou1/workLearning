package com.main.learn.thinking.chapter15.bound;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Solid2<T extends Dimension & HasColor & Weight> extends ColorDimension2<T> {

    Solid2(T item) {
        super(item);

    }

    int weight() {
        return item.weight();
    }
}
