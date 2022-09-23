package com.dietelProject.chapterFifteen;

import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextToFile {
    public static void main(String[] args) throws IOException {
        try (Formatter output = new Formatter("clients.txt")) {
            Scanner scanner = new Scanner(System.in);

            System.out.printf("%s%n%s%n", "Enter account number, enter firstname, lastname and balance", "Enter the windows end of file to end program");


            while (scanner.hasNext()) {
                try {
                    output.format("%d %s %s %.2f", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
                }catch (NoSuchElementException e){
                    System.err.println("Invalid input, pls try again");
                    scanner.nextLine();
                }
                System.out.println("? ");
            }
        }catch (SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }
//       try {
//           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
//           bufferedWriter.write("My first write to file");
//           bufferedWriter.close();
//       }catch (IOException e){
//           e.printStackTrace();
//       }

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
//            System.out.println(bufferedReader.readLine());
//            bufferedReader.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }
}
