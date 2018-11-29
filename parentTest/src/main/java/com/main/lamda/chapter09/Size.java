package com.main.lamda.chapter09;

/**
 * @author sunlei19
 * @create 2018/11/28
 */
public interface Size {
    int size();

    default boolean isEmpty() {
        return size() > 0;
    }
}
