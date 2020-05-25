package com.main.learn.refactoring.chapter6;

/**
 * 分解临时变量
 * 针对每次赋值，创造一个独立、对应的临时变量
 */
public class SplitTemporyVariable {

    private static double _height = 10D;
    private static double _width = 15D;

    // old
    private static void calculate() {
        double temp = 2 * (_height + _width);
        System.out.println(temp);
        temp = _height * _width;
        System.out.println(temp);
    }


    // new
    private static void newCalculate() {
        calculatePerimeter();
        calculateArea();
    }

    private static void calculateArea() {
        final double area = _height * _width;
        System.out.println(area);
    }

    private static void calculatePerimeter() {
        final double perimeter = 2 * (_height + _width);
        System.out.println(perimeter);
    }


    public static void main(String[] args) {
        calculate();
        newCalculate();
    }
}
