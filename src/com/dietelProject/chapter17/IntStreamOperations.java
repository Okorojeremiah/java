package com.dietelProject.chapter17;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.println("Displaying the original value");

        String value = IntStream.of(values)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(" "));
        System.out.println(value);

        System.out.println(IntStream.of(values)
                                    .count());

        System.out.println(IntStream.of(values)
                                    .min()
                                    .getAsInt());

        System.out.println(IntStream.of(values)
                                    .max()
                                    .getAsInt());

        System.out.println(IntStream.of(values)
                                    .sum());

        System.out.println(IntStream.of(values)
                                    .average()
                                    .getAsDouble());

        System.out.println(IntStream.of(values)
                                    .reduce(0, (x, y) -> x + y));

        System.out.println(IntStream.of(values)
                                    .reduce((x, y) -> x * y)
                                    .getAsInt());

        System.out.println(IntStream.of(values)
                                    .map(x -> x * x)
                                    .sum());

        System.out.println(IntStream.of(values)
                                    .sorted()
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining(" ")));
    }
}
