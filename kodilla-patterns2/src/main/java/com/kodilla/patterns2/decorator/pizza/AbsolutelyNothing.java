package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbsolutelyNothing extends AbstractPizzaDecorator {
    public AbsolutelyNothing(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + absolutely nothing!!! :) (but costs more.)";
    }
}
