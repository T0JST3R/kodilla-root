package com.kodilla.spring.Calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(Double result){

        System.out.println(result);
    }
}
