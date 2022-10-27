package com.dietelProject.chapterFifteen.fileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromAFile {
    public static void main(String[] args) {
        FileInputStream input = null;

        try {
            input = new FileInputStream("Text.txt");
            byte[] byt = new byte[input.available()];

            input.read(byt);

            for (byte b : byt) {
                System.out.write(b);
            }
            System.out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(input != null) input.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
