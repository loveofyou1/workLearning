package com.main.learn.designModel.createDesignModel.factory.abstractFactory;

import com.main.learn.designModel.createDesignModel.factory.simpleFactory.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
