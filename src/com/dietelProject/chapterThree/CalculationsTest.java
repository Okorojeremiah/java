package com.dietelProject.chapterThree;

public class CalculationsTest {

	public static void main(String[] args){

	Calculations maths = new Calculations();

	int addition = maths.addNumber(2,5);
	int subtraction = maths.subtractNumber(10,6);
	int division = maths.divideNumber(20,10);
	int multiplication = maths.multiplyNumber(30,40);

	System.out.printf("Addition is %d%n", addition);
	System.out.printf("Subtraction is %d%n", subtraction);
	System.out.printf("division is %d%n", division);
	System.out.printf("multiplication is %d%n", multiplication);


	}

}