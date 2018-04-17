package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage() {

        //Given

        int[] list = new int[10];

        for (int i = 0; i <= 9; i++)
            list[i] = i;

        //When


        //Then
        System.out.println(ArrayOperations.getAverage(list));


        Assert.assertEquals(4.5 , ArrayOperations.getAverage(list) , 0.0001);
    }


}
