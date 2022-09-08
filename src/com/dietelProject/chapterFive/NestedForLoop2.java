package com.dietelProject.chapterFive;

public class NestedForLoop2 {

    public static void main(String[] args) {
        int row;
        int column;
        int n = 6;


        for (row = 1; row <= n; row++) {
            for (column = 1; column <= row; column++){
                System.out.print("  "+column);
            }
            System.out.println();
        }
    }
}
