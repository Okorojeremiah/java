package com.dietelProject.chapterFifteen.fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        Path path = Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.printf("%n%s exist %n", path.getFileName());
            System.out.printf("%s a directory%n",
                    Files.isDirectory(path)? "Is": "IsNot");
            System.out.printf("%s absolute",
                    path.isAbsolute()? "is" : "IsNot");
            System.out.printf("Last modified time: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s", path.toAbsolutePath());
        }


    }
}
