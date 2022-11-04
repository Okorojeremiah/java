package com.dietelProject.moreOnchapter15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextToFile2 {
    public static void main(String[] args) {
        try (Formatter formatter = new Formatter("Company customers.txt")){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s %s%n", "Enter account number, First name, Last name and balance.",
                    "Enter the window end of file to end program");

            while (scanner.hasNext()){
                try { formatter.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());

                }catch (NoSuchElementException e){
                    System.err.println("Error, please try again");
                    scanner.nextLine();
                }
            }

        }catch (SecurityException | FormatterClosedException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
