package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> list) {
        List<Integer> even = new ArrayList<>();
        for (Integer value : list) {
            if(value%2 == 0){
                even.add(value);
            }
        }

        return even;

    }

}

