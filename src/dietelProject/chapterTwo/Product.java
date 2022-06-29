package dietelProject.chapterTwo;

//program that calculates and prints the product of three integer

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first interger: ");
		int x = input.nextInt();

		System.out.print("Enter the second interger: ");
		int y = input.nextInt();

		System.out.print("Enter the third interger: ");
		int z = input.nextInt();

		int result = x * y * z;

		System.out.printf("product is %d%n" , result);
		
	}
}

