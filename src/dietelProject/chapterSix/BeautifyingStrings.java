package dietelProject.chapterSix;

import java.util.Scanner;

public class BeautifyingStrings {

    public static void main(String[] args) {
        beautifyString();
    }

    public static void checkFullStopAddFullStop(String input){
        int number = input.length();
       if (input.charAt(number - 1) != '.'){
           String x = input + '.';
           System.out.println(x);
       }
    }
    public static void checkUpperCaseCapitalizeFirstLetter(String input){
        if(!input.substring(0, 1).equals(input.substring(0, 1).toUpperCase())){
            String output = input.substring(0,1).toUpperCase() + input.substring(1);
            checkFullStopAddFullStop(output);
        }
    }
    public static void beautifyString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scanner.nextLine();
        checkUpperCaseCapitalizeFirstLetter(input);
    }
}
