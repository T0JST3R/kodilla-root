package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {


    static double getAverage(int[] numbers) {


        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();

        double result1 = result.getAsDouble();


        return result1;

    }
}
