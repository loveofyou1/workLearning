package com.main.learn.designModel.abstractFactory;

import com.main.learn.designModel.factory.Circle;
import com.main.learn.designModel.factory.Rectangle;
import com.main.learn.designModel.factory.Shape;
import com.main.learn.designModel.factory.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {

        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
