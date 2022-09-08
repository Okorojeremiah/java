package com.dietelProject.chapterFourteen;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s = "The world is a beautiful place";
        char[] fill = new char[9];

        System.out.printf("%s : %d%n", "The string length is", s.length());

        System.out.printf("%s", "The reverse string is: ");

        for (int i = s.length() - 1; i >= 0; i--){
            System.out.printf("%c", s.charAt(i));
        }

        s.getChars(0, 9, fill, 0);
        System.out.printf("%n%s", "The character array is: ");

        for (char character : fill){
            System.out.print(character);
        }
    }
}
