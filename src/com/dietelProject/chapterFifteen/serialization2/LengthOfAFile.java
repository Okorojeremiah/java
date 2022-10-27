package com.dietelProject.chapterFifteen.serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LengthOfAFile {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("Text.txt");
            byte[] byt = new byte[inputStream.available()];
            inputStream.read(byt);

            System.out.println("The length of the array is "+ byt.length);
            for (byte b: byt) {
                System.out.write(b);
                System.out.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(inputStream != null) inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
