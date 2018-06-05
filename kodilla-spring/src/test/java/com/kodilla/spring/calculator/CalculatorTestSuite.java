package com.kodilla.spring.calculator;

import com.kodilla.spring.Calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void calculatorTest() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double res1 = calculator.add(2, 4);
        Double res2 = calculator.sub(8, 2);
        Double res3 = calculator.mul(2, 3);
        Double res4 = calculator.div(36, 6);

        //Then
        Assert.assertEquals(6, res1, 0);
        Assert.assertEquals(6, res2, 0);
        Assert.assertEquals(6, res3, 0);
        Assert.assertEquals(6, res4, 0);

    }
}
