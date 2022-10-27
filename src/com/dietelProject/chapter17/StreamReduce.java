package com.dietelProject.chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        //Summing all integers from 1-10
        //Normal for-loop

        int total = 0;
        for (int i = 1; i <= 10; i++){
            total+=i;
        }
        System.out.println(total);

        //Stream-based

        System.out.printf("%s%d%n", "The sum of 1 through 10 is ", IntStream.rangeClosed(1, 10).sum());

        //Calculating the sum of all even values from 2 - 20

        int total1 = 0;
        for(int i = 2; i <= 20; i+=2){
            total1+=i;
        }
        System.out.println(total1);

        System.out.printf("%s%d", "The sum of even values from 2 through 20 is ",
                IntStream.rangeClosed(1, 10)
                        .map(x -> x * 2)
                        .sum());


        System.out.printf("%s%d", "Sum of the triples of the even ints from 2 through 10 is",
                IntStream.rangeClosed(1, 10)
                         .filter(x -> x % 2 == 0)
                         .map(x -> x * 3)
                         .sum());
    }

}