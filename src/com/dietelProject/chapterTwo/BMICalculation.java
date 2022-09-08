package com.dietelProject.chapterTwo;

import java.util.Scanner;


public class BMICalculation {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
	double weight = input.nextDouble();

	System.out.print("Enter height in inches: ");
	double height = input.nextDouble();
	
	double weight1 = weight * 0.45359237;
	double height1 = height * 0.0254;

	double BMI =  weight1/(height1 * height1);


	System.out.printf("BMI is %f%n", BMI);

	}


}