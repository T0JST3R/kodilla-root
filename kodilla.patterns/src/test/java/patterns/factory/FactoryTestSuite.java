package patterns.factory;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        // Then
        Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());

    }

    @Test
    public void testFactoryRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals("the long rectangle", rectangle.getName());
    }

    @Test
    public void testFactorySquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);
        Assert.assertEquals(28.0, square.getCircumference(), 0);
        Assert.assertEquals("The angular square", square.getName());
    }

}
