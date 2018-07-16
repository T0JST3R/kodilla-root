package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import org.omg.CORBA.TRANSACTION_ROLLEDBACK;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaDecoratorTestSuite {
    @Test
    public void fullPizzaGetCostTest() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new MushroomsDecoration(theOrder);
        theOrder = new AbsolutelyNothing(theOrder);
        theOrder = new WithoutChefExtras(theOrder);
        theOrder = new WormsDecoration(theOrder);

        assertEquals(new BigDecimal(38), theOrder.getCost());

    }

    @Test
    public void fullPizzaGetDescriptionTest() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new MushroomsDecoration(theOrder);
        theOrder = new AbsolutelyNothing(theOrder);
        theOrder = new WithoutChefExtras(theOrder);
        theOrder = new WormsDecoration(theOrder);

        assertEquals("Pizza with cheese and Tomatoes  + mushrooms + absolutely nothing!!! :) (but costs more.) -Chef's extras. + extra worms", theOrder.getDescription());
    }

}