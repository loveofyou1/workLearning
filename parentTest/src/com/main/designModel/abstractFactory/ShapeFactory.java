package com.main.designModel.abstractFactory;

import com.main.designModel.factory.Circle;
import com.main.designModel.factory.Rectangle;
import com.main.designModel.factory.Shape;
import com.main.designModel.factory.Square;

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
