package chapter15.objectSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ObjectSerialization {

    public static void main(String[] args) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("account"))){
            Accounts accounts = new Accounts();
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n%s%n",
                    "Enter account number, first name, last name and balance",
                    "Enter the window end of file to end program");

            while(scanner.hasNext()){
                try{
                    Account account = new Account(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
                    accounts.getAccounts().add(account);

                }catch (NoSuchElementException noSuchElementException){
                    System.err.println("wrong input try again");
                    scanner.nextLine();
                }
                System.out.println("?");
                output.writeObject(accounts);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
