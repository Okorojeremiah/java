package com.dietelProject.chapterFourteen;

import java.util.Arrays;

public class StringMiscellaneous1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
            //newArr(arr1);
            //secondReverse(arr1);
            //secondArr();
            // stringCompare();
        letsCheck();
}

    public static void newArr(int[] arr){
        int[] newArr = new int[5];
        for(int i = arr.length - 1 ; i >= 0; i--){
            newArr[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void secondArr(){
        String s1 = "hello there";
        char[] arr = new char[5];
        System.out.printf("s1 == %s%n", s1);

        System.out.printf("Length of s1: %d", s1.length());

        System.out.printf("%nThe reversed string is: ");

        for (int count = s1.length() - 1; count >= 0; count--) {

            if(s1.charAt(count) == 'e'){
                System.out.print(s1.charAt(count));
            }
        }
        s1.getChars(0,5, arr, 0);
        System.out.printf("%nThe character array is: ");


        for(char character : arr){
            System.out.print(character);
        }
        System.out.println();
    }
    public static void secondReverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int others = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[others];
            arr[others] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void stringCompare(){
        String s1 = new String("Hello");
        String s2 = "goodbye";
        String s3 = "Happy birthday";
        String s4 = "Happy birthday";

        if(s1.equals("Hello")){
            System.out.println("s1 equals \"Hello\"");
        }
        else {
            System.out.println("s1 does not equals \"Hello\"");
        }

        if(s3.equalsIgnoreCase(s4)){
            System.out.printf("%s equals %s with case ignored%n", s3, s4);
        } else{
            System.out.println("s3 does not equal s4");
        }
        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) is %d%n%n", s4.compareTo(s3));

        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match");
        }
        else {
            System.out.println("First 5 characters of s3 and s4 do not match");
        }
    }

    public static void letsCheck(){
        String[] check = {"started", "stint", "Stressed", "ended", "extreme"};

        for(String string : check){
            if(string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
        }
    }
}
