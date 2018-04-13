package com.main.designModel.abstractFactory;

import com.main.designModel.factory.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();


        AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.color();

        Color blue = colorFactory.getColor("BLUE");
        blue.color();

        Color green = colorFactory.getColor("GREEN");
        green.color();
    }
}
