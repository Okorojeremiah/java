package dietelProject.chapterTwo;

// a program that calculates divisibility

import java.util.Scanner; // program uses class Scanner

public class Divisibility {

	//main method begins to execute java application
	public static void main(String[] args) {

		//create a Scanner to obtain input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: "); //prompt
		int integer = input.nextInt(); // reads the integer

		System.out.print("x: "); //prompt for the divisible number
		int x = input.nextInt(); // reads the number

		int z = integer%x; // calculates and stores the reminder in z

		if (z > 0) {
			System.out.printf("%d is not divisible by %d", integer, x); //displays the of conditional statement
		}

		if (z == 0) {
			System.out.printf("%d is divisible by %d", integer, x);
		}
	}

}

