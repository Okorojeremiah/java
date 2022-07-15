package dietelProject.chapterFive;

import java.util.Scanner;

public class SwitchMultiSelectionStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int total = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        System.out.printf("%s%n%s%n   %s%n   %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/macOS type <Ctrl> d then press Enter", "On Windows type <ctrl> z then press Enter");

        while (scan.hasNext()) {
            int grade = scan.nextInt();
            total = total + grade;
            count++;

            switch(grade/10) {
                case 9:
                case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;

            }
        }

        System.out.print("%nGrade Report:%n");

        if (count != 0) {
            double average = (double) total/ count;

            System.out.printf("Total of the %d grades entered is %d%n", count, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%d%d%n%d%n%s%d%n", "Number of students who received each grade:", "A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ", fCount);
        }else {
            System.out.println("No grades were entered");
        }


    }

}
