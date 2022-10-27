package com.dietelProject.chapterFifteen.fileIO.creditInquiry;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOptions[] choices = MenuOptions.values();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuOptions accountType = getRequest(scanner);

        while(accountType != MenuOptions.END){
            switch (accountType){
                case ZERO_BALANCE -> System.out.printf("%nAccount with zero balance:%n");
                case CREDIT_BALANCE -> System.out.printf("%nAccount with credit balance:%n");
                case DEBIT_BALANCE -> System.out.printf("%nAccount with debit balance:%n");
            }
            readRecord(accountType);
            accountType = getRequest(scanner);
        }
    }

    private static void readRecord(MenuOptions accountType) {
        try(Scanner scanner = new Scanner(Paths.get("clients.txt"))){
            while(scanner.hasNext()){
                int accountNumber = scanner.nextInt();
                String firstName = scanner.next();
                String lastName = scanner.next();
                double balance = scanner.nextDouble();

                if(shouldDisplay(accountType, balance)){
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
                }else {
                    scanner.nextLine();
                }
            }

        }catch (NoSuchElementException | IllegalStateException | IOException exception){
            System.err.println("Error processing file, terminating...");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(MenuOptions accountType, double balance) {
        if ((accountType == MenuOptions.ZERO_BALANCE) && (balance == 0)) {
            return true;
        }
        else if ((accountType == MenuOptions.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else return (accountType == MenuOptions.DEBIT_BALANCE) && (balance > 0);
    }

    private static MenuOptions getRequest(Scanner scanner) {
        int request = 4;
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s",
                "1->List of zero balance",
                "2->List of credit balance",
                "3->List of debit balance",
                "4-> Terminate program");
        try {
            do {
                System.out.printf("%n? ");
                request = scanner.nextInt();
            }
            while (request < 0 || request > 4);
        }catch (NoSuchElementException noSuchElementException){
            System.err.println(noSuchElementException.getMessage());
        }
        return choices[request -1];
    }
}
