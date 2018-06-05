package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuit {

    @Test
    public void testDoDrawingWithCircle(){

        //Given
        Shape circle = new Circle();
        Drawer drawer = new Drawer(circle);


       //When
        String result = drawer.doDrawing();

        //Then
        Assert.assertEquals("This is a circle" , result);
    }
    @Test
    public void testDoDrawingWithTriangle(){

        //Given
        Shape triangle = new Triangle();
        Drawer drawer = new Drawer(triangle);

        //When

       String result = drawer.doDrawing();

       //Then

        Assert.assertEquals("This is a triangle" , result);
    }


}
