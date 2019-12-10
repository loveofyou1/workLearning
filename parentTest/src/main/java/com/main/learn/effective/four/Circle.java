package com.main.learn.effective.four;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/11 00:02
 */
public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
