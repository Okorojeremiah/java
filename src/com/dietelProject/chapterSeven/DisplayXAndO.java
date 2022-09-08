package com.dietelProject.chapterSeven;

public class DisplayXAndO {
    public static void main(String[] args) {
    displayArray();
    }

    private static final String[][] array = new String[3][5];

    public static void fillA(){
        array[0][0] = "X";
        array[0][1] = "|";
        array[0][2] = "O";
        array[0][3] = "|";
        array[0][4] = "X";
    }

    public static void fillB(){
        array[1][0] = "O";
        array[1][1] = "|";
        array[1][2] = "X";
        array[1][3] = "|";
        array[1][4] = "O";
    }

    public static void fillC(){
        array[2][0] = "X";
        array[2][1] = "|";
        array[2][2] = "X";
        array[2][3] = "|";
        array[2][4] = "O";
    }

    public static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            switch (i) {
                case 0:
                    fillA();
                case 1:
                    fillB();
                case 2:
                    fillC();
            }
        }
    }
    public static void displayArray(){
        fillArray();
        for (String[] i : array){
            for (String j : i){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}


