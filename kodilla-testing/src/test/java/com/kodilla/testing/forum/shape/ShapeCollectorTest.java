package com.kodilla.testing.forum.shape;

import com.kodilla.testing.shape.*;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTest {

    @Test
    public void testAddShape() {
        //Given


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(8);
        Shape circle = new Circle(16);
        Shape triangle = new Triangle(3, 4);
        //When
        shapeCollector.add(square);
        shapeCollector.add(circle);
        shapeCollector.add(triangle);
        //Then
        Assert.assertEquals(square, shapeCollector.get(0));
        Assert.assertEquals(circle, shapeCollector.get(1));
        Assert.assertEquals(triangle, shapeCollector.get(2));
    }

    @Test
    public void testRemoveShape() {
        //Given


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(8);
        Shape circle = new Circle(24);
        Shape triangle = new Triangle(34, 44);
        shapeCollector.add(square);
        shapeCollector.add(circle);
        shapeCollector.add(triangle);

        //When
        shapeCollector.remove(0);
        shapeCollector.remove(0);
        shapeCollector.remove(0);
        //Then
        Assert.assertEquals(null, shapeCollector.get(0));
        Assert.assertEquals(null , shapeCollector.get(1));
        Assert.assertEquals(null , shapeCollector.get(2));

    }
}