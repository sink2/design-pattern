package org.sink2.design.factory;

import org.sink2.design.factory.shape.Circle;
import org.sink2.design.factory.shape.Square;
import org.sink2.design.factory.shape.Triangle;

import javax.lang.model.type.*;

public class ShapeFactory {
    public static Shape getShape(ShapeType st) {
        switch (st) {
            case Circle:
                return new Circle();
            case Triangle:
                return new Triangle();
            case Square:
                return new Square();
            default:
                throw new UnknownTypeException(null, st);
        }
    }
}