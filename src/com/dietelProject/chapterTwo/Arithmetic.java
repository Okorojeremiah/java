package com.dietelProject.chapterTwo;

// an application that displays the sum, average, product, smallest and largest of three integers

import java.util.Scanner; // program uses class Scanner

public class Arithmetic {

	//main method begins to execute java application
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creates a Scanner to obtain input

		System.out.print("Enter the first integer: "); //prompt
		int integer1 = input.nextInt(); // reads first input

		System.out.print("Enter the second integer: "); 
		int integer2 = input.nextInt();

		System.out.print("Enter the third integer: ");
		int integer3 = input.nextInt();

		System.out.print("Enter the number of integers: "); //prompt
		int min,max;
		int n = input.nextInt(); //reads number of integers n
		int array[] = {integer1, integer2, integer3};


		int result1 = integer1 + integer2 + integer3; // calculates and stores the sum of integer
		int result2 = integer1 * integer2 * integer3; // calculates and stores the product of the integers
		int result4 = result1 / n; // calculates and stores the avarage of the integers

		System.out.printf("Sum of all integers is %d%n", result1); // displays the sum
		System.out.printf("Product of the integers is %d%n", result2); // displays the product
		System.out.printf("Avarage is %d%n", result4); // displays the avarage

	}

}

