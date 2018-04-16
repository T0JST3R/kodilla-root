package com.kodilla.stream.com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Europe implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
        BigDecimal sand = new BigDecimal(213);
        sandQuantity.add(sand);
        return sandQuantity;
    }
}
