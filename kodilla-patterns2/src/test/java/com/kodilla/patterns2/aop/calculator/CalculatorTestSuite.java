package com.kodilla.patterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    private final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd() {
        LOGGER.info("Starting add test");
        double result = calculator.add(4, 4);
        assertEquals(8, result, 0);
    }

    @Test
    public void testSub() {
        LOGGER.info("Starting sub test");
        double result = calculator.sub(5, 3);
        assertEquals(2, result, 0);

    }

    @Test
    public void testMul() {
        LOGGER.info("Starting multiply test");
        double result = calculator.mul(2, 2);
        assertEquals(4, result, 0);

    }

    @Test
    public void testDiv() {
        LOGGER.info("Starting div test");
        double result = calculator.div(5, 5);
        assertEquals(1, result, 0);

    }

    @Test
    public void testFactorial() {
        //Given
        //When
        BigDecimal result = calculator.factorial(new BigDecimal(1000));
        //Then
        LOGGER.info("testing method factorial");
        System.out.println(result);

        assertTrue(BigDecimal.ONE.compareTo(result) < 0);
        //
    }
}