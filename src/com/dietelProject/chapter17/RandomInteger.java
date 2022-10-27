package com.dietelProject.chapter17;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomInteger {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for(int i = 1; i <= 10; i++){
            System.out.println(1 + secureRandom.nextInt(6));
        }

        // Using streams
        System.out.println("Printing random numbers on separate lines");
                secureRandom.ints(10, 1, 7)
                            .forEach(System.out::println);

        System.out.println("printing random numbers on a straight line");

        String number = secureRandom.ints(10, 1, 7)
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining(" "));
        System.out.println(number);
    }
}
