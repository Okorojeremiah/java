package tddClass;

import java.math.BigDecimal;

public class Account {
    private int balance;
    private String name;
    private String pin;
    private String number;

    public Account(String accountName, String accountNumber, String accountPin ){
        pin = accountPin;
        name = accountName;
        number = accountNumber;
    }

    public boolean isCorrectPin(String pin){
        return pin.equals(this.pin);
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin))return balance;
        return 0;
    }

    public void deposit(int amount) {
        boolean isValidAmount = amount > 0;
        if(isValidAmount) balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if(isCorrectPin(pin) && (balance >= amount) && amount > 0)
            balance -= amount;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

}
