package dietelProject.chapterSeven;

import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] arrayF = {0,34,35,67,56,98,76,45};

        System.out.println(arrayF[5]);
        System.out.println();

        int[] arrayG = {8,8,8,8,8};
        for (int i = 0; i<arrayG.length; i++){
            System.out.println(arrayG[i]);
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);

        double[] arrayC= new double[10];

        int total = 0;

        for(int i = 0; i < arrayC.length; i++){
            System.out.println("Enter the values of arrayC");
            arrayC[i] = scan.nextDouble();
            total+=arrayC[i];
        }
        System.out.println(total);


    }
}
