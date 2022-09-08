package com.dietelProject.chapterFive;

public class NestedForLoop3 {


    public static void main(String[] args) {
        for (int row = 6; row >= 1;){
            for (int space = 6; space > row;){
                System.out.print(" ");
                space--;
            }
            for (int num = 1; num <= row;){
                System.out.print(num);
                num++;
            }
            System.out.println();
            row--;
        }
    }
}

