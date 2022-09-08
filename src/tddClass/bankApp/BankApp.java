package tddClass.bankApp;

import tddClass.account.Account;
import tddClass.account.InvalidAmountThrowException;
import tddClass.account.InvalidPinThrowException;
import tddClass.account.WrongAccountNumberException;

import java.util.Objects;

public class BankApp {
    private int numberOfCustomers = 0;
    private final Account[] accounts = new Account[10];


    public void createAccount(String accountName, String pin) {
        Account account = new Account(accountName, (numberOfCustomers +1) + "", pin);
        accounts[numberOfCustomers] = account;
        numberOfCustomers++;}

    public Account findAccounts(String accountNumber){
        for (Account account : accounts){
            boolean accountFound = Objects.equals(account.getNumber(), accountNumber);
            if(accountFound)
                return account;
        }
        throw new NullPointerException("Account does not exist");
    }

    public void deposit(int amount, String acctNumber){
        Account account = findAccounts(acctNumber);
        account.deposit(amount);
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void withdrawal(int amount, String pin, String acctNumber){
        Account account = findAccounts(acctNumber);
        account.withdraw(amount, pin);
    }

    public void transfer(int amount, String pin, String senderAccountNumber, String recipientAccount) throws InvalidRecipientAccountNumberException {
        if(Objects.equals(recipientAccount, senderAccountNumber)) throw new InvalidRecipientAccountNumberException("Cannot transfer to own account");
        findAccounts(senderAccountNumber);
        findAccounts(recipientAccount);
        withdrawal(amount,pin,senderAccountNumber);
        deposit(amount,recipientAccount);
    }

    public int checkBalance(String accountNumber, String pin){
        Account account = findAccounts(accountNumber);
        if (!account.isCorrectPin(pin)) throw new InvalidPinThrowException("Please enter a valid pin");
        return account.getBalance(pin);
    }
}
