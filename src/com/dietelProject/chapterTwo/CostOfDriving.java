package com.dietelProject.chapterTwo;

import java.util.Scanner;


public class CostOfDriving {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the driving distance: ");
	double distance = input.nextDouble();

	System.out.print("Enter miles per gallon: ");
	double mpg = input.nextDouble();

	System.out.print("Enter price per gallon: ");
	double ppg = input.nextDouble();


	double numOfGallons = distance/mpg;
	double costOfGallons = numOfGallons * ppg;

	System.out.printf("The cost of driving is %f%n", costOfGallons);

	
	}


}