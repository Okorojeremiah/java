package com.dietelProject.chapterThree;

import java.util.Scanner;


public  class BankAppTest {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	BankApp account1 = new BankApp("Jane", 300);
	BankApp account2 = new BankApp("Job", 200);

//	System.out.print("Enter a depositAmount for account1: ");
//	double depositAmount = input.nextDouble();
//	account1.deposit(depositAmount);
		account1.withdrawal(2000);

	System.out.printf("balance for %s is $%.2f", account1.getName(), account1.getBalance());
	
	}
}