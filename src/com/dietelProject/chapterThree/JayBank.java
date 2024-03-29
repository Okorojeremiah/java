package com.dietelProject.chapterThree;

public class JayBank {

	private String name;
	private double balance;

	public JayBank(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}





