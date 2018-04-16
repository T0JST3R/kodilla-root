package com.kodilla.testing.shape;

public class Square implements Shape {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getShapeField() {
        return size*size;
    }
}
