package org.sink2.design.factory;

public class Main {
    public static void main(String[] args) {
        Shape circleShape = ShapeFactory.getShape(ShapeType.Circle);
        circleShape.draw();
        circleShape.clean();
        Shape squareShape = ShapeFactory.getShape(ShapeType.Square);
        squareShape.draw();
        squareShape.clean();
        Shape triangleShape = ShapeFactory.getShape(ShapeType.Triangle);
        triangleShape.draw();
        triangleShape.clean();
    }
}
