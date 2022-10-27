package chapter15.fileMatching;

public class Account1 {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public Account1(int account, String firstName, String lastName, double balance) {
        if (!validateAccountNumber(account)){
            throw new InvalidAccountNumber("Wrong account number");
        }
        this.account = account;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        if (validateAccountNumber(account)){
            this.account = account;
        }

        throw new InvalidAccountNumber("Wrong account number");
    }

    private static boolean validateAccountNumber(int accountNumber) {
        String account = String.valueOf(accountNumber);
        return account.matches("\\d{3}");
    }

    private static boolean validateName(String name){
        return name.matches("[A-za-z]+");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (validateName(firstName)){
            this.firstName = firstName;
        }else throw new WrongNameFormatException("Wrong name format, please enter name without numbers");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (validateName(firstName)){
            this.lastName = lastName;
        }else throw new WrongNameFormatException("Wrong name format, please enter name without numbers");

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double combine(TransactionRecord transactionRecord){
        return transactionRecord.getAmount() + getBalance();
    }
}
