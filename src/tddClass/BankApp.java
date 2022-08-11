package tddClass;

public class BankApp {

    private int numberOfCustomers;
    private final Account[] accounts = new Account[10];


    public void createAccount(String accountName, String pin) {
        Account account = new Account(accountName, (numberOfCustomers +1) + "", pin);
        accounts[numberOfCustomers] = account;
        numberOfCustomers++;
    }

    public Account findAccounts(String accountNumber){
        for (Account account : accounts){
            if(account.getNumber().equals(accountNumber))
                return account;
        }
        return null;
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

    public void transfer(int amount, String pin, String accountNumber, String recipientAccount) throws IllegalAccessException {
        Account account = findAccounts(accountNumber);
        boolean isValid = amount <= account.getBalance(pin) && amount > 0 &&  account.isCorrectPin(pin);
        if(recipientAccount == accountNumber){
            throw new IllegalAccessException("Cannot transfer to own account");
        }
        if(isValid){
            account.withdraw(amount,pin);

            Account account1 = findAccounts(recipientAccount);
            account1.deposit(amount);
        }

    }
}
