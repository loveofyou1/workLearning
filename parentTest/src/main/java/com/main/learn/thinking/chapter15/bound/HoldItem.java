package com.main.learn.thinking.chapter15.bound;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class HoldItem<T> {
    T item;

    HoldItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}
