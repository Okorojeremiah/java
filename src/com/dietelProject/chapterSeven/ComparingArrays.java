package com.dietelProject.chapterSeven;

public class ComparingArrays {
    static boolean result;


     public static void compare(String[] array, String[] arrays){
         for (int i = 0; i < array.length; i++) {
             if (array[i] != arrays[i]){
                 System.out.println(false);
                 System.exit(1);
             }
         }
         System.out.println(true);
    }

    public static void main(String[] args) {
         String[] array = {"Jerry", "Gabs", "Ray","MM"};
         String[] arrays = {"Jerry", "Gabs", "Ray","MM"};
         compare(array, arrays);
    }
}
