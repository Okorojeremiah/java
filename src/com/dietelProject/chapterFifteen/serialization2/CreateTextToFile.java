package com.dietelProject.chapterFifteen.serialization2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextToFile {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter("list.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n%s%n%s%s%n", "Enter name", "age", "skin-color", "Enter the windows end of file to end program");

            while (scanner.hasNext()){
                try {
                    formatter.format("%s %d %s", scanner.next(), scanner.nextInt(), scanner.next());
                }catch (NoSuchElementException e){
                    System.out.println("please enter a valid input");
                    scanner.nextLine();
                }
                System.out.println("? ");
            }
        }catch (SecurityException | IOException e){
            e.printStackTrace();
        }
    }
}
