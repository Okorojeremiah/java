package dietelProject.ChapterSix;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        userInput();
    }

    public static void userInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digits");
        String input = scanner.nextLine();

        while (input.length() != 5){
            System.out.println("Input must be 5 digits");
            try {
                input = input.substring(0, 5);
                System.out.println("Enter 5 digits");
                input = scanner.nextLine();
            } catch(StringIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }

        char array[] = input.toCharArray();


        if (input.charAt(0) == input.charAt(4) && input.charAt(1) == input.charAt(3)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }

}
