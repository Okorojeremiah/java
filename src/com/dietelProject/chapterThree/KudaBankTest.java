package com.dietelProject.chapterThree;

import java.util.Scanner;


public class KudaBankTest {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	KudaBank Jerry = new KudaBank();

	
	System.out.println("Enter name: ");
	String theName = input.nextLine();
	Jerry.setAcctName(theName);

	System.out.println("Enter Account Number: ");
	String theAcctNum = input.nextLine();
	Jerry.setAcctNum(theAcctNum);

	System.out.println("Enter pin: ");
	String thePin = input.nextLine();
	Jerry.setPin(thePin);

	System.out.println("Enter deposit; ");
	double theDeposit = input.nextDouble();
	Jerry.setDeposit(theDeposit);
	
	System.out.printf("Your balance is %f", Jerry.getBalance());
	}
}