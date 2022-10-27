package com.dietelProject.chapterFifteen.fileIO;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        Working with output stream

//        System.out.write(75);
//        System.out.flush();

//        for (int i = 32; i < 127; i++){
//            System.out.write(i);
//        }
//        System.out.flush();

        String jay = "Jerry is really cool.";
        byte[] data = jay.getBytes(); // using getByte method to get the byte of a string and saving it in a byte array

       try {
           System.out.write(data);
       }catch (IOException e){
           e.printStackTrace();
       }finally{
           System.out.close();
       }

       // working with inputStream

//        try {
//            int byt = System.in.read(); // for single byte
//            System.out.write(byt);
//            System.out.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        try {
//            int[] byt = new int[20]; // reading multiple byte
//            for (int i = 0; i < byt.length; i++){
//                byt[i] = System.in.read();
//            }
//            for (int j : byt) {
//                System.out.write(j);
//            }
//            System.out.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        // -1 means end of file
//
//        try {
//            InputStream input = new FileInputStream("clients.txt");
//
//            while(true){
//                int data = input.read();
//                if (data == -1){
//                    System.out.println("End of stream");
//                    break;
//                }else {
//                    System.out.write(data);
//                }
//                System.out.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // gathering chunks of data

//        try {
//            byte[] data = new byte[20];
//            System.in.read(data);
//
//            for (byte datum : data) {
//                System.out.write(datum);
//            }
//            System.out.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // To get the length of a file
//        InputStream data = null;
//        try {
//            data = new FileInputStream("clients.txt");
//            byte[] d = new byte[data.available()];
//            data.read(d);
//
//            System.out.println("The array length is: " + d.length);
//
//            for (byte b : d){
//                System.out.write(b);
//                System.out.flush();
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                if (data != null) data.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
    }
}
