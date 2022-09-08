package com.dietelProject.chapterTwo;

import java.util.Scanner;


public class IntegerCalculation {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int integer1 = input.nextInt();

	System.out.print("Enter the second integer: ");
	int integer2 = input.nextInt();

	int sum = integer1 + integer2;
	int product = integer1 * integer2;
	int difference = integer1 - integer2;
	int quotient = integer1 / integer2;

	System.out.printf("Sum of the integers is %d%n", sum);
	System.out.printf("product of the integers is %d%n", product);
	System.out.printf("Difference of the integers is %d%n", difference);
	System.out.printf("Quotient of the integers is %d%n", quotient);
			
	}
	
}