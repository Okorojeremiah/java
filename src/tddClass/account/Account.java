package tddClass.account;

import java.math.BigDecimal;
import java.util.Objects;

public class  Account {
    private int balance;
    private String name;
    private String pin;
    private String number;

    public Account(String accountName, String accountNumber, String accountPin ){
        if (accountPin == null) throw new InvalidPinThrowException("Please enter a 4 digit pin");
        int len = accountPin.length();
        if (len != 4) throw new InvalidPinThrowException("Please enter a 4 digit pin");
        for (int i = 0; i < len; i++){
            if ((!Character.isDigit(accountPin.charAt(i)))) throw new InvalidPinThrowException("Pin must not include letters or symbols");
            pin = accountPin;
        }

        int len2 = accountName.length();
        for (int i = 0; i < len2; i++){
            if ((!Character.isLetter(accountName.charAt(i)))) throw new WrongNameFormatException("Name must not include numbers or symbols");
            name = accountName;
        }
        number = accountNumber;
    }
    public boolean isCorrectPin(String pin){
        if (pin == null) throw new InvalidPinThrowException("Please enter a 4 digit pin");
        int len = pin.length();
        if (len != 4) throw new InvalidPinThrowException("Please enter a 4 digit pin");
        for (int i = 0; i < len; i++){
            if ((!Character.isDigit(pin.charAt(i)))) throw new InvalidPinThrowException("Pin must not include letters or symbols");
        }
        return pin.equals(this.pin);
    }

    public int getBalance(String pin) throws InvalidPinThrowException {
        if(pin.equals(this.pin))return balance;
        throw new InvalidPinThrowException("Please enter a valid pin");
    }

    public void deposit(int amount) {
        boolean isValidAmount = amount > 0;
        if(!isValidAmount) throw new InvalidAmountThrowException("Please enter a valid amount");
        balance += amount;
    }

    public void withdraw(int amount, String pin){
        boolean validation = isCorrectPin(pin);
        boolean validation2 = balance >= amount && amount > 0;
        if(!validation) throw new InvalidPinThrowException("Please enter a valid pin");
        if (!validation2) throw new InvalidAmountThrowException("Please enter a valid amount");
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
