package com.main.learn.designModel.createDesignModel.factory.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getAbstractFactory(String clone) {
        if (clone.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (clone.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
