package dietelProject.ChapterSeven;

import java.util.Arrays;
import java.security.SecureRandom;

public class ArraySort {
    private static int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    public static void main(String[] args) {
//        sortAscending();
        sortDescending();
//        shuffle();
    }
    public static void shuffle(){
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < number.length; i++ ){
               int randomIndex = rand.nextInt(number.length);
               int temp = number[randomIndex];
               number[randomIndex] = number[i];
               number[i] = temp;
        }
        for(int i : number){
            System.out.print(i + " ");
        }
    }

    public static void sortDescending(){
        for (int i = 0; i < number.length; i++ ){
            for (int j = i + 1; j < number.length; j++){
                int tmp = 0;
                if (number[i] < number[j]){
                    tmp = number[i];
                    number[i] = number[j];
                    number[j] = tmp;
                }
            }
            System.out.print(number[i] + " ");
        }
    }

    public static void sortAscending(){
        for (int i = 0; i < number.length; i++ ){
            for (int j = i + 1; j < number.length; j++){
                int tmp = 0;
                if (number[i] > number[j]){
                    tmp = number[i];
                    number[i] = number[j];
                    number[j] = tmp;
                }
            }
            System.out.print(number[i] + " ");
        }
    }
}
