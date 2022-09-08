package com.dietelProject.chapterThree;

public class BankApp{

	private String name;
	private double balance;


	public BankApp(String name, double balance) {
	this.name = name;
		if (balance > 0.0) {
		this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}

	public  void withdrawal(double amount){
		if(amount <= balance && amount > 0){
			balance -= amount;
			System.out.println(amount + " processed for " + getName() + " new balance is " + balance);
		} else if (amount > balance) {
			System.out.println("withdrawal amount exceeded balance");
		}
	}
	
	public double getBalance() {

		return balance;
	}
		
	public void setName(String name) {
		this.name = name;
	
	}

	public String getName() {
		return name;
	}


}