package dietelProject.chapterFour;

import java.util.Scanner;

public class SentinelControlLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int gradeCount = 0;

        System.out.print("Enter a grade or -1 to quit: ");
        int grade = scan.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCount = gradeCount + 1;
            System.out.print("Enter a grade or -1 to quit: ");
            grade = scan.nextInt();
        }

        if (gradeCount != 0){
            double average = (double)total / gradeCount;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCount, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else{
            System.out.print("No grades were entered");
        }
    }
}
