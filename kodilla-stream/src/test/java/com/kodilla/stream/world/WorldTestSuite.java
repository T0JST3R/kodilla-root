package com.kodilla.stream.world;

import com.kodilla.stream.com.kodilla.stream.com.kodilla.stream.world.Continent;
import com.kodilla.stream.com.kodilla.stream.com.kodilla.stream.world.Country;
import com.kodilla.stream.com.kodilla.stream.com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        BigDecimal pl = new BigDecimal("40000000");
        BigDecimal ger = new BigDecimal("82000000");
        BigDecimal fr = new BigDecimal("67000000");
        BigDecimal usa = new BigDecimal("326000000");
        //Canada population
        BigDecimal cnd = new BigDecimal("36000000");
        //Chile population
        BigDecimal chl = new BigDecimal("18000000");
        BigDecimal arg = new BigDecimal("44000000");
        World earth = new World();
        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        Continent southAmerica = new Continent();
        Country poland = new Country(pl);
        Country germany = new Country(ger);
        Country france = new Country(fr);
        Country USA = new Country(usa);
        Country canada = new Country(cnd);
        Country chile = new Country(chl);
        Country argentina = new Country(arg);


        //  When
        earth.addContinent(europe);
        earth.addContinent(northAmerica);
        earth.addContinent(southAmerica);
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        northAmerica.addCountry(USA);
        northAmerica.addCountry(canada);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(argentina);

        //Then

        Assert.assertTrue(europe.getCountries().contains(poland));
        Assert.assertFalse(europe.getCountries().contains(USA));
        Assert.assertEquals(613000000 , earth.getPeopleQuantity().intValue());

        System.out.println(earth.getPeopleQuantity());


    }
}
