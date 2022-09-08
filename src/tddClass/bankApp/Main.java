package tddClass.bankApp;

import tddClass.account.InvalidAmountThrowException;
import tddClass.account.InvalidPinThrowException;
import tddClass.account.WrongAccountNumberException;
import tddClass.account.WrongNameFormatException;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main {
    private static final BankApp jayblinks = new BankApp();


    public static void main(String[] args) {
        startMain();
    }

    private static void startMain() {
        String mainMenu = """
                Welcome to Jayblinks Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Find Account
                7 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput) {
            case "1": createAccount();
            case "2": deposit();
            case "3": withdraw();
            case "4": transfer();
            case "5": checkBalance();
            case "6": findAccount();
            case "7": exit(7);
        }
    }

    private static void findAccount() {
        try {
            String accountNumber = input("Enter the account number you want to find: ");
            jayblinks.findAccounts(accountNumber);
            display(String.format("found account is %s", jayblinks.findAccounts(accountNumber).getName()));
        }
        catch (NullPointerException e){
            System.out.println("Account does not exist");
        }
        startMain();
    }

    private static void checkBalance() {
        try {
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your desired pin: ");

            display(String.format("Balance is %d", jayblinks.findAccounts(accountNumber).getBalance(pin)));
        }
        catch (InvalidPinThrowException e){
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Account number does not exist");
        }
        startMain();
    }
    private static void transfer() {
        String senderAccountNumber = input("Enter your account number: ");
        String recipientAccountNumber = input("Enter benefactor account number: ");
        String pin = input("Enter your pin: ");
        int amount = inputInt();
        try{
            jayblinks.transfer(amount,pin,senderAccountNumber,recipientAccountNumber);
            display(String.format("%d was transferred to account %s, your balance is %d. ", amount, recipientAccountNumber, jayblinks.findAccounts(senderAccountNumber).getBalance(pin)));
        }
        catch (InvalidAmountThrowException | InvalidPinThrowException | InvalidRecipientAccountNumberException e){
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Account number does not exist");
        }
        startMain();
    }

    private static void withdraw() {
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin: ");
        int amount = inputInt();
        try{
            jayblinks.withdrawal(amount,pin,accountNumber);
            display(String.format("You withdrew %d from your account, your balance is %d. ", amount, jayblinks.findAccounts(accountNumber).getBalance(pin)));
        }
        catch (InvalidAmountThrowException | InvalidPinThrowException e){
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Account does not exist");
        }
        startMain();
    }

    private static void deposit() {
        String accountNumber = input("Enter your account number: ");
        int amount = inputInt();
        try {
            jayblinks.deposit(amount, accountNumber);
            System.out.printf("You deposited %d. ", amount);
        }
        catch (InvalidAmountThrowException e){
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Account does not exist");
        }
        startMain();
    }

    private static int inputInt() {
        try {
            display("Enter amount: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid amount");
        }
        return 0;
    }

    private static void createAccount() {
        String accountName = input("Enter your account name without space: ");
        String pin = input("Enter your desired pin: ");
        try {
            jayblinks.createAccount(accountName, pin);
            System.out.printf("%s%s%s", "Account created for ", accountName, ". ");
        }catch (InvalidPinThrowException | WrongNameFormatException | WrongAccountNumberException e){
            System.out.println();
        }
        startMain();
    }

    private static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }
}
