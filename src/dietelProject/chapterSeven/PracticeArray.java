package dietelProject.chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
//        int [] numerals;
//        int [] numbers = new int[5];
//        numbers[4] = 89;
//        System.out.println(Arrays.toString(numbers));
//
//        int [] numerals = {2, 4, 6, 8, 10};
//
//        System.out.println(numerals[0]);
//
//        ArrayList <Integer>nums = new ArrayList<>();
//
//        nums.add(8);
//        nums.add(7);
//        nums.add(3);
//        nums.add(4);
//
//        System.out.println(nums.size());
//        System.out.println(nums.contains(11));
//        System.out.println(nums.remove(1));
//        System.out.println(nums.size());
//        System.out.println(nums);
//        nums.clear();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or -1 to quit");
        int number = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(number);

        while(number != -1){
            System.out.println("Enter a number or -1 to quit");
            number = scanner.nextInt();
            if(number != -1) {
                numbers.add(number);
            }
        }
        System.out.print("List of negative numbers are: ");
        for (int i: numbers) {
            if (i < 0){
                System.out.print(i + " ");
            }
        }
        System.out.print("list of positive numbers are: ");
        for (int i : numbers){
            if(i > 0){
                System.out.print(i + " ");
            }
        }
        int total = 0;
        for (int i : numbers) {

            if (i == 7) {
                total++;
            }
        }
        System.out.println("Seven was entered " + total + " time(s)");
    }
}
