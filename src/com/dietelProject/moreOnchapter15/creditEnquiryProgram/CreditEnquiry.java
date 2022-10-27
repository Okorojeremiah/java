package chapter15.creditEnquiryProgram;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreditEnquiry {
    private static final MenuOptions[] choices = MenuOptions.values();

    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        MenuOptions accountType = getRequest(option);

        while(accountType != MenuOptions.END){
            switch (accountType){
                case ZERO_BALANCE: System.out.printf("%nAccounts with zero balance%n");
                break;
                case CREDIT_BALANCE: System.out.printf("%nAccounts with credit balance%n");
                break;
                case DEBIT_BALANCE: System.out.printf("%nAccounts with debit balance");
                break;
            }
            readFiles(accountType);
            accountType = getRequest(option);
        }

    }
    private static void readFiles(MenuOptions accountType) {
        try (Scanner scanner = new Scanner(Paths.get("Company customers.txt"))){

            System.out.printf("%n%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

            while (scanner.hasNext()){
                int account = scanner.nextInt();
                String firstName = scanner.next();
                String lastName = scanner.next();
                double balance = scanner.nextDouble();

                if (shouldDisplay(accountType, balance)){
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", account, firstName, lastName, balance);

                }else {
                    scanner.nextLine();
                }
            }

        }catch (NoSuchElementException | IOException e){
            System.err.println("Opps, you entered the wrong value");
        }
    }

    private static boolean shouldDisplay(MenuOptions options, double balance) {
        if (options == MenuOptions.ZERO_BALANCE && balance == 0) return  true;
        else if (options == MenuOptions.CREDIT_BALANCE && balance < 0) {
            return  true;
        }
        else return options == MenuOptions.DEBIT_BALANCE && balance > 0;
    }

    private static MenuOptions getRequest(Scanner option) {
        int request = 4;

        System.out.printf("Enter a number to select an option%n%s%n%s%n%s%n%s%n%n",
                "1. List account with zero balance",
                "2. List account with credit balance",
                "3. List account with debi balance",
                "4. Terminate program");
        try{ do {
            request = option.nextInt();

        }while (request < 1 || request > 4);

        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        return choices[request - 1];
    }
}
