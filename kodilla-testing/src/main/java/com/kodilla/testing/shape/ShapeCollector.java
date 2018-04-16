package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(int position) {
        shapes.remove(position);

    }

    public Shape get(int position) {
        if (position + 1 <= shapes.size()) {

            return shapes.get(position);
        }
        else return null;

    }
}
