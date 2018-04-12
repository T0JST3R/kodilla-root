package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OddNumbersExterminatorTest {
    private OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        //Then
        assertEquals(0 ,result.size() ,0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> list = Arrays.asList(4, 4 ,4 ,2 ,1 ,2,3, 5, 7 , 9);
        List<Integer> expected = Arrays.asList(4, 4 ,4 ,2 ,2);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        //Then
        assertEquals(5 ,result.size() ,0);
        assertEquals(expected ,result );
    }
}

