package com.kodilla.testing;

import com.kodilla.testing.SimpleUser;
import com.kodilla.testing.Calculator;
public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        double result1 = calculator.addAtoB(5, 3);
        double result2 = calculator.substractAfromB(6,3);

        if(result1==8 ) {
            System.out.println("Test addAtoB = Success");
        }
        else {
            System.out.println("Test addAtoB = Something went wrong");
        }
        if (result2==3) {
            System.out.println("substractAfromB =Success");
        }
        else {
            System.out.println("substractAfromB = Something went wrong");
        }
    }
}
