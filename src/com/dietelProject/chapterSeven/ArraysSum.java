package com.dietelProject.chapterSeven;

public class ArraysSum {

    public static void main(String[] args) {

        int total = 0;


        int [] array = {50, 60, 75, 69, 45,90};

        for (int count = 0; count < array.length; count++){
            total = total + array[count];
        }
        System.out.printf("the total of the numbers in the array is %d", total);
    }

}
