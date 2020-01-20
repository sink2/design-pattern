package org.sink2.design.factory.shape;

import org.sink2.design.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Start drawing circle");
    }

    @Override
    public void clean() {
        System.out.println("Clean circle");
    }
}
