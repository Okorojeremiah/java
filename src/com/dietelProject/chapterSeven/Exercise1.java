package com.dietelProject.chapterSeven;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        print1sAnd0s();
    }

    public static void print1sAnd0s(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<2; i++){
            System.out.println("Enter number");
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> System.out.printf("%d%n", 0);
                case 0 -> System.out.printf("%d%n", 1);
            }
            scanner.nextLine();
        }
    }
}
