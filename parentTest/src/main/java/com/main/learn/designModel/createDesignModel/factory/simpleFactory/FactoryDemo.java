package com.main.learn.designModel.createDesignModel.factory.simpleFactory;

/**
 * 简单工程模式
 */
public class FactoryDemo {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        Shape circle = simpleFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = simpleFactory.getShape("SQUARE");
        square.draw();

        Shape rectangle = simpleFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
