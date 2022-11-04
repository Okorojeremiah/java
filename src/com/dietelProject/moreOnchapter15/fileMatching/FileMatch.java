package com.dietelProject.moreOnchapter15.fileMatching;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileMatch {
    public static void main(String[] args) {
        fileMatcher();
    }

    public static void fileMatcher(){
        try(Formatter out = new Formatter("newmast.txt");
                Scanner scanner = new Scanner(Paths.get("oldmast.txt"));
                Scanner scanner1 = new Scanner(Paths.get("trans.txt"))){

            while(scanner.hasNext()){
               Account1 account1 = new Account1(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
               TransactionRecord transactionRecord = new TransactionRecord(scanner1.nextInt(), scanner1.nextDouble());

               if (account1.getAccount() == transactionRecord.getAccountNumber()){
                   out.format("%-10d %-12s %-12s %10.2f%n", account1.getAccount(), account1.getFirstName(), account1.getLastName(), account1.combine(transactionRecord));
               }else if (account1.getAccount() != transactionRecord.getAccountNumber()){
                    out.format("%-10d %-12s %-12s %10.2f%n", account1.getAccount(), account1.getFirstName(), account1.getLastName(), account1.getBalance());
               }
               if (transactionRecord.getAccountNumber() != account1.getAccount()){
                   try(Formatter formatter = new Formatter("log.txt")){
                       formatter.format("%s%d%n", "Unmatched transaction record for account number ", transactionRecord.getAccountNumber());
                   }
               }
            }

        }catch (IOException | NoSuchElementException | FormatterClosedException e){
            e.printStackTrace();
            System.out.println("file processing error");
            System.exit(1);
        }
    }
}
