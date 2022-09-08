package com.dietelProject.chapterTwo;

// a program that calculates and displays the number of minutes in a year

import java.util.Scanner;

public class MinutesCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter minutes: ");
		int minutes = input.nextInt();

		
		int numberOfMinutesInAYear = 525600;
		
		int numberOfMinutesInADay = 1440;
			
		int numberOfYears = minutes / numberOfMinutesInAYear;
		int test = minutes % numberOfMinutesInAYear;
		int numberOfDays = test / numberOfMinutesInADay;

		System.out.printf("%d minutes is approximately %d year(s) and %d day(s)", minutes, numberOfYears, numberOfDays);

	}

}