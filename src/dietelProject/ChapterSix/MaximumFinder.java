package dietelProject.ChapterSix;

import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three integers seperated by spaces: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum number is " + result);
    }


    private static double maximum(double number1, double number2, double number3) {
        double maximumNumber = number1;
        if (number2 > number1) {
            maximumNumber = number2;
        }
        if (number3 > number1) {
            maximumNumber = number3;
        }

        return maximumNumber;
    }
}
