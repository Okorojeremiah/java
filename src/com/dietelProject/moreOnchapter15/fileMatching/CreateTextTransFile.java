package chapter15.fileMatching;

import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextTransFile {
    public static void main(String[] args) {
        try(Formatter out = new Formatter("trans.txt")){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n%s%n", "Enter account number and amount",
                    "Enter the windows end of file to terminate program");

            while(scanner.hasNext()){
                try{
                    TransactionRecord transactionRecord = new TransactionRecord(scanner.nextInt(), scanner.nextDouble());
                    out.format("%d %.2f%n", transactionRecord.getAccountNumber(), transactionRecord.getAmount());
                }catch (NoSuchElementException exception){
                    System.err.println("Wrong entry, please try again");
                    scanner.nextLine();
                }
                System.out.println("?");
            }

        }catch(IOException | SecurityException | FormatterClosedException exception){
            exception.printStackTrace();
        }
    }
}
