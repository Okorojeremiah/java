package dietelProject.chapterThree;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guessNumber = 100;

        System.out.print("Guess the correct number:");
        int number = input.nextInt();

        if (number > guessNumber) {
            System.out.println("Your number is too high");
        }
        if (number==guessNumber){
            System.out.println("You are right!");
        }
        if (number < guessNumber) {
            System.out.println("Your number is too low");
        }
    }

}
