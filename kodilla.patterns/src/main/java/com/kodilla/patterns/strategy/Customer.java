package com.kodilla.patterns.strategy;

public class Customer {
    protected BuyPredictor predictor;
    final private String name;

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String predict(){
        return predictor.predictWhatToBuy();
    }
    public void setBuingPredictor(BuyPredictor predictor){
        this.predictor = predictor;
    }
}
