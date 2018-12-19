package com.main.learn.designModel.abstractFactory;

import com.main.learn.designModel.factory.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
