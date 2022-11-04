package com.dietelProject.chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.printf("Sorting array using stream %s%n",
                Arrays.stream(values)
                .sorted()
                .collect(Collectors.toList()));


        List<Integer> greaterThan4 = Arrays.stream(values).filter(v -> v > 4).collect(Collectors.toList());
        System.out.println(greaterThan4);

        System.out.printf("%s%n", greaterThan4.stream().sorted().collect(Collectors.toList()));

        System.out.printf("%s%n", Arrays.stream(values).filter(v -> v > 4).sorted().collect(Collectors.toList()));
    }
}
