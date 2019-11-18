package com.main.learn.effective.four;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/11 00:03
 */
public class Rectangle extends Figure {

   private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
