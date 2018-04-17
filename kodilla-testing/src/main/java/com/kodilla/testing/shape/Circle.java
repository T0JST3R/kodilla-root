package com.kodilla.testing.shape;

public class Circle implements Shape {
   private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getShapeField() {
        return 2*(3.14*r);
    }
}
