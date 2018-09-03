package com.main.designModel.abstractFactory;

import com.main.designModel.factory.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
