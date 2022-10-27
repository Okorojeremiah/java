package com.dietelProject.chapterFifteen.fileIO;

import java.io.*;

public class BufferedInputAndOutputStream {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("text.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("clients.txt"));

            for (int i = bufferedInputStream.read(); i != -1; i = bufferedInputStream.read()){
                bufferedOutputStream.write(i);
            }
            bufferedOutputStream.flush();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
