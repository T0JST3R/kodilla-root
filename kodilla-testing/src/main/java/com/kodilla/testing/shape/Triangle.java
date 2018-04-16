package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double length;
    private double height;



    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getShapeField() {
        return 2/length*height;
    }
}
