package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GettingFilePath {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file or directory name");
        Path path = Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.printf("%n%s%n", path.getFileName());
            System.out.printf("%s%n", path.isAbsolute());
            System.out.printf("%s%n", path.getRoot());
            System.out.printf("%s%n", Files.isDirectory(path));
            System.out.printf("%s%n", path.toAbsolutePath());
            System.out.printf("%s%n", Files.getLastModifiedTime(path));
        }

        if (Files.isDirectory(path)) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

            for (Path dir : directoryStream) {
                System.out.printf("%s%n", dir);
            }
        }
    }
}
