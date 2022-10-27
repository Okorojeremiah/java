package com.dietelProject.chapterFifteen.fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        //writeToFileOne();
        writeToFileTwo();

    }

    private static void writeToFileTwo() {
        String[] cars = {"Honda", "Toyota", "Peugeot", "Volvo"};
        try(FileOutputStream fos = new FileOutputStream("cars.txt");
            PrintStream printStream = new PrintStream(fos))
        {
         System.setOut(printStream);
         for(String car: cars){
             System.out.println(car);
         }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void writeToFileOne() {
        try(FileOutputStream fos = new FileOutputStream("test.txt");
            PrintWriter writer = new PrintWriter(fos)) {
            writer.println("We are unicorns!!!") ;
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
