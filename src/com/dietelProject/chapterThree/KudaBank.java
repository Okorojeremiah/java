package com.dietelProject.chapterThree;

public class KudaBank {

	private String acctName;
	private String acctNum;
	private String pin;
	private double balance;
	private double deposit;


	public void setAcctName(String acctName) {
	this.acctName = acctName;
	}

	public String getAcctName() {
	return acctName;
	}

	public void setAcctNum(String acctNum) {
	this.acctNum = acctNum;
	}

	public String getAcctNum() {
	return acctNum;
	}

	public void setPin(String pin) {
	this.pin = pin;
	}

	public String getPin() {
	return pin;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
		this.balance = balance;
		}
	}

	public void setDeposit(double deposit) {
	this.deposit = deposit;
	}

	public double getDeposit() {
	return deposit;
	}

	public void setDepositAmount(double deposit) {
		if (deposit > 0.0) {
		balance = balance + deposit;
		}
	}


	public double getBalance() {
	return balance;
	}
}




	
	

