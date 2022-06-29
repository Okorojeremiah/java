package dietelProject.chapterTwo;

// a program that calculates multiples

import java.util.Scanner; // program uses class Scanner

public class Multiples {

	//main method begins to execute java application
	public static void main(String[] args) {

		//create a Scanner to obtain input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: "); //prompt
		int integer1 = input.nextInt(); // reads the first integer

		System.out.print("Enter second integer: "); //prompt
		int integer2 = input.nextInt(); // reads the second integer

		int result1 = integer1 * 3; // triples the value of integer1 
		int result2 = integer2 * 2; // doubles the value of integer2 
	
		int z = result1%result2; //determines the multiple

		if (z > 0) {
			System.out.printf("%d is not a multiple of %d", result1, result2); //prints the result 
		}

		if (z == 0) {
			System.out.printf("%d is a multiple of %d", result1, result2); // prints the result
		}
	}

}