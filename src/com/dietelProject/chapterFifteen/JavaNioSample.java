package Chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class JavaNioSample {
    public static void main(String[] args) throws IOException {
//        java.nio classes Paths Files and interfaces Path and DirectoryStream
        Path path = Paths.get("/home/codefactory/Documents");
//        Files.newOutputStream()
        System.out.println("is a directory -> " +Files.isDirectory(path));
        System.out.println("is a directory ->" +Files.isHidden(path));
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

        for(Path path1: directoryStream){
            System.out.println("is directory -> "+Files.isDirectory(path1));
        }
        for(Path path2: directoryStream){
            if(!Files.isDirectory(path2)){
                BufferedWriter writer = Files.newBufferedWriter(path2);
                writer.write("Hello world");
                writer.close();
            }
        }

    }
}
