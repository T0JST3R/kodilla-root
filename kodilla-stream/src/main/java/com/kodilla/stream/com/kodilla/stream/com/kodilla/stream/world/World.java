package com.kodilla.stream.com.kodilla.stream.com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {
    private Set<Continent> continents = new HashSet<>();

    public Set<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent) {

        continents.add(continent);


    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                        .map(Country::getPeopleQuantity)
                        .reduce(BigDecimal.ZERO, (sum, put) -> sum = sum.add(put));


    }
}
