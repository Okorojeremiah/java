package chapter15.fileMatching;

public class TransactionRecord {
    private int accountNumber;
    private double amount;

    public TransactionRecord(int accountNumber, double amount) {
        if (!validateAccountNumber(accountNumber)){
            throw new InvalidAccountNumber("Wrong account number");
        }
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (validateAccountNumber(accountNumber)){
            this.accountNumber = accountNumber;
        }else throw  new InvalidAccountNumber("Wrong account number");
    }

    private static boolean validateAccountNumber(int accountNumber) {
        String account = String.valueOf(accountNumber);
        return account.matches("\\d{3}");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
