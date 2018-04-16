package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class WeatherStub implements Temperatures {

    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();
        //Dummy data

        stubResult.put(0 , 25.5);
        stubResult.put(1, 24.4);
        stubResult.put(2, 24.1);
        stubResult.put(3, 32.1);
        stubResult.put(4, 32.2);

        return stubResult;
    }
}
