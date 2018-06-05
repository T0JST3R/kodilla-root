package com.kodilla.patterns.strategy;

public class AgressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "Agressive prediction";
    }
}
