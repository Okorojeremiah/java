package dietelProject.chapterFour;

import java.util.Scanner;

public class ClassAverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("Enter a grade:");
            int grade = input.nextInt();
            total = total  + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total/10;
        System.out.printf("the total of all 10 numbers is %d%n", total);
        System.out.printf("the average of all 10 numbers is %d%n", average);

    }
}
