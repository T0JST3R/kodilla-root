package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers ={
            {"6234623642346 " , "John" , "Smith"},
            {"1241241244255" , "Ivone" , "Novak"},
            {"6732462623343" , "Jessie" , "Pinkman"},
            {"4316321345321" , "Walter" , "White"},
            {"5734634623453" , "Clara" , "Lanson"}
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}


