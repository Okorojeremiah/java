package com.dietelProject.chapterFifteen.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriterSample {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("/home/codefactory/Documents/test.txt")){
            fileWriter.write("just do it");
        } catch(IOException e){
            e.printStackTrace();
        }
    }


}
