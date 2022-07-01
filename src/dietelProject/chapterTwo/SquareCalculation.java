package dietelProject.chapterTwo;

// a program that prints the square, the sum of the squares and the difference of the squares of two integers

import java.util.Scanner; // program uses scanner

public class SquareCalculation {

	//main method begins to execute java application
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // standard input object

		System.out.print("Enter first interger: "); 
		int interger1 = input.nextInt(); 

		System.out.print("Enter the second interger: "); //prompt
		int interger2 = input.nextInt(); 

		int result = interger1 * interger1;
		int result2 = interger2 * interger2;
		int sum = result + result2;
		int difference = result - result2;
		

		System.out.printf("Square of %d is %d%n", interger1, result);
		
		System.out.printf("Square of %d is %d%n", interger2, result2);
		
		System.out.printf("Sum of both squares is %d%n", sum);
		
		System.out.printf("Difference of the squares is %d%n", difference);
	}
}