package com.dietelProject.chapterSeven;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        duplicateElimination();
    }

    public static void duplicateElimination(){
        Scanner scanner = new Scanner(System.in);
        int[] number = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

       for(int i = 1; i <= number.length; i++){
           System.out.println("Enter numbers between 10 and 100");
           number[i] = scanner.nextInt();
           if (number[i] >= 10 && number[i] <= 100){
               System.out.println(number[i]);
           }
       }
    }
}
