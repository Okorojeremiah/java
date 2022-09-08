package com.dietelProject.chapterThree;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account myAcct = new Account();

		myAcct.getName();

		System.out.printf("initial name is: %s%n", myAcct.getName());

		System.out.print("please enter the first name: ");
		String theName = input.nextLine();

		myAcct.setName(theName);

		System.out.printf("the name in the object account is: %n%s", myAcct.getName());

	}

}
