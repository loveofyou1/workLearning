package com.main.learn.designModel.createDesignModel.factory.abstractFactory;

import com.main.learn.designModel.createDesignModel.factory.simpleFactory.Circle;
import com.main.learn.designModel.createDesignModel.factory.simpleFactory.Rectangle;
import com.main.learn.designModel.createDesignModel.factory.simpleFactory.Shape;
import com.main.learn.designModel.createDesignModel.factory.simpleFactory.Square;

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
