package com.dietelProject.chapterTwo;

// Comparing an integer and it squares with the number 100

import java.util.Scanner; // program uses scanner

public class ComparingIntegers {

	//main method begins to execute java application
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // standard input object

		System.out.print("Enter integer: "); 
		int integer = input.nextInt();  

		int result = integer * integer;

		int number = 100;
		
		if (integer > number) {
			System.out.printf("%d > %d%n", integer, number);
		}

		if (integer < number) {
			System.out.printf("%d < %d%n", integer, number);
		}

		if (integer == number) {
			System.out.printf("%d == %d%n", integer, number);
		}

		if (integer != number) {
			System.out.printf("%d != %d%n", integer, number);
		}

		if (result > number) {
			System.out.printf("%d > %d%n", result, number);
		}

		if (result < number) {
			System.out.printf("%d < %d%n", result, number);
		}

		if (result == number) {
			System.out.printf("%d == %d%n", result, number);
		}

		if (result != number) {
			System.out.printf("%d != %d%n", result, number);
		} 

		
	}

}
	