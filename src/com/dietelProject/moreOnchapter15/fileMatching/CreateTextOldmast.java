package chapter15.fileMatching;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextOldmast {
    public static void main(String[] args) {
        try(Formatter out = new Formatter("oldmast.txt")){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n%s%n", "Enter account number, first name, last name and balance",
                    "Enter the windows end of file key to terminate program");

            while(scanner.hasNext()){
                try{
                    Account1 account1 = new Account1(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
                    out.format("%d %s %s %.2f%n", account1.getAccount(), account1.getFirstName(), account1.getLastName(), account1.getBalance());
                }catch(NoSuchElementException e){
                    System.err.println("Wrong entry, try again");
                    scanner.nextLine();
                }
                System.out.println("?");
            }

        }catch (SecurityException | IOException e){
            e.printStackTrace();
        }
    }
}
