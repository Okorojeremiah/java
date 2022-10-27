package com.dietelProject.chapterFifteen.serialization2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EndOfFile {
    public static void main(String[] args) throws IOException {
        InputStream data = null;

        try {
            data = new FileInputStream("Text.txt");

            while(true){
                int dat = data.read();
                if (dat == -1){
                    System.out.println("End of file");
                    break;
                }else {
                    System.out.write(dat);
                }
                System.out.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            assert data != null;
            data.close();
        }
    }
}
