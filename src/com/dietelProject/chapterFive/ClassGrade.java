package com.dietelProject.chapterFive;

import java.util.Scanner;

import java.util.Scanner;

public class ClassGrade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gradeRange = 0;


        for(int count = 1; count <= 6; count++) {
            System.out.print("Enter your grade: ");
            int grade = scan.nextInt();

            if (grade >= 90 && grade <=100) {
                gradeRange = 90;
            }else if (grade >= 60 && grade <= 89) {
                gradeRange = 60;
            }else if (grade >= 50 && grade <= 59) {
                gradeRange = 50;
            }else if (grade >= 40 && grade <= 49) {
                gradeRange = 40;
            }else if (grade >= 30 && grade <= 39) {
                gradeRange = 30;
            }else if(grade >= 20 && grade <= 29){
                gradeRange = 20;
            }else if(grade > 100) {
                System.out.println("Out of grade range");
            }else {
                System.out.println("Your grade is F");
            }


            switch(gradeRange) {
                case 90:
                    System.out.println("Your grade is A");
                    break;
                case 60:
                    System.out.println("Your grade is B");
                    break;
                case 50:
                    System.out.println("Your grade is C");
                    break;
                case 40:
                    System.out.println("Your grade is D");
                    break;
                case 30:
                    System.out.println("Your grade is E");
                    break;
                case 20:
                    System.out.println("Your grade is F");
                    break;
            }
        }

    }

}


