package chapter15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextToFile {
    public static void main(String[] args) {
        try(Formatter output = new Formatter("clients.txt")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter account number, first name, last name and balance. Enter the end of file key to end program");

            while(scanner.hasNext()){
                try {output.format("%s %s %s %.2f%n", scanner.next(), scanner.next(), scanner.next(), scanner.nextDouble());

                }catch (NoSuchElementException e){
                    System.out.println("Error, please enter a correct value");
                    scanner.nextLine();
                }
                System.out.println("?");
            }

        }catch (SecurityException | FormatterClosedException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
