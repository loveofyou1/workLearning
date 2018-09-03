package com.main.designModel.factory;

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
