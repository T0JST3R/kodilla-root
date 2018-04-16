package com.kodilla.testing.forum.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTest {

    @Test
    public void testAddShape() {
        //Given


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(8);
        //When
        shapeCollector.add(square);
        //Then
        Assert.assertEquals(square , shapeCollector.get(0));
    }
    @Test
    public void testRemoveShape() {
        //Given


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(8);
        shapeCollector.add(square);
        //When
       shapeCollector.remove(0);
        //Then
        Assert.assertEquals(null, shapeCollector.get(0));
    }

    @Test
    public void addTriangleTest() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(3, 4);
        // When
        shapeCollector.add(triangle);
        //Then

        Assert.assertEquals(triangle , shapeCollector.get(0));
    }
    @Test
    public void removeTriangleTest(){

        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(3, 5 );
        // When
        shapeCollector.add(triangle);
        shapeCollector.remove(0);
        //Then
        Assert.assertEquals(null , shapeCollector.get(0));
    }
}