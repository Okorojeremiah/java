package tddClass;

public class Account1 {

    private int balance;
    public void deposit(int amount) {
            balance = balance + amount;
        }


    public int getBalance() {
        return balance;

    }

    public void withdraw(int withdrawnAmount) {
        balance = balance - withdrawnAmount;

    }
}
