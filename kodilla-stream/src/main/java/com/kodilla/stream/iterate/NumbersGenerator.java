package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(3, d -> d + 1 )
                .limit(max)
                .filter(n -> n%2==0)
                .forEach(System.out::println);


    }
}