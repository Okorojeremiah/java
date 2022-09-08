package com.dietelProject.chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {


    public static void main(String[] args) {
        int [] arrays = {54, 2, 3};
        sortDescending(arrays);
        System.out.println();
        sortAscending(arrays);
        System.out.println();
        shuffle(arrays);
    }
    public static void shuffle(int[] number){
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < number.length; i++ ){
               int randomIndex = rand.nextInt(number.length);
               int temp = number[randomIndex];
               number[randomIndex] = number[i];
               number[i] = temp;
        }
        for(int i : number){
            System.out.print(i + " ");
        }
    }

    public static void sortDescending(int [] array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++ ){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }

    public static void sortAscending(int[] arrays){
        for (int i = 0; i < arrays.length; i++ ){
            for (int j = i + 1; j < arrays.length; j++){
                int tmp = 0;
                if (arrays[i] > arrays[j]){
                    tmp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(arrays));
    }
}
