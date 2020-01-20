package org.sink2.design.factory.shape;

import org.sink2.design.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Start drawing square");
    }

    @Override
    public void clean() {
        System.out.println("Clean square");
    }
}
