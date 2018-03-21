package com.kodilla.testing;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.addAtoB(5,5);
        double result2 = calculator.substractAfromB(5, 5);

        if(result1 ==10) {
            System.out.println("addAtoB test result = success");
        }
        else {
            System.out.println("addAtoB test result = failed");
        }
        if(result2 ==0){
            System.out.println("substractAfromB test = success");
        }
        else {
            System.out.println("substractAfromB test = failed");
        }
    }
}
