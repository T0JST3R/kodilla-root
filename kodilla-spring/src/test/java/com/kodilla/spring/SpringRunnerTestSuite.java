package com.kodilla.spring;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import com.kodilla.spring.shape.*;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle", name);
    }

    @Test
    public void testSquareAddedIntoContainer() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Shape shape = (Shape)context.getBean("createSquare");

        Assert.assertEquals("This is a Square", shape.getShapeName());
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("choosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Choosen shape says: " + name);
    }

    @Test

    public void testConditional(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        // When
        Boolean book2Exists = context.containsBean("book2");
        // Then

        System.out.println("Is book 2 exist? ==" + book2Exists);
    }

}
