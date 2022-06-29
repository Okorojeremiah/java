package dietelProject.chapterTwo;

import java.util.Scanner;



public class RunwayLength {


	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enterspeed: ");
	double speed = input.nextDouble();

	System.out.print("Enter acceleration: ");
	double acceleration = input.nextDouble();

	double length = (speed * speed)/(2 * acceleration);

	System.out.printf("The minimum runway length for this airplane is %f%n", length);	


	}

}

