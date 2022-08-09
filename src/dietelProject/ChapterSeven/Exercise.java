package dietelProject.ChapterSeven;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
    getMaxMin();
    }
    public static void getMaxMin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scanner.nextInt();
        int counter = 1;

        int highestNumber1 = number1;
        int lowestNumber1 = number1;

        while (counter < 5) {
            System.out.println("Enter number " + (counter + 1) );
            int number = scanner.nextInt();

            boolean larger = number > highestNumber1;
            boolean smaller = number < lowestNumber1;

            if (larger) {
                highestNumber1 = number;
            }
            if (smaller) {
                lowestNumber1 = number;
            }
            counter++;
        }
        System.out.println("The largest number is " + highestNumber1);
        System.out.println("The smallest number is " + lowestNumber1);
    }
}
