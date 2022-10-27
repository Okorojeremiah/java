package com.dietelProject.chapterFifteen.fileIO;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFileWithScanner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner("clients.txt")){

        }catch (NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }

    }
}
