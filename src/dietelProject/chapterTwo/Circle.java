package dietelProject.chapterTwo;

// an application that calculates diameter, circumference and Area of a circle

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius: ");
		int r = input.nextInt();

		System.out.printf("diameter is %d%n", (2 * r));
		System.out.printf("circumference is %f%n", (2 * Math.PI * r));
		System.out.printf("area is %f%n", (Math.PI * (r * r)));

	}

}