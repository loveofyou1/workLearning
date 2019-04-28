package com.main.learn.thinking.chapter15.bound;

import java.awt.*;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Bounded extends Dimension implements HasColor, Weight {

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
