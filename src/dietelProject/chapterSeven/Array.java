package dietelProject.chapterSeven;

public class Array {
    public static void main(String[] args) {

        double[] myList = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");
        int i;
        for (i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        for (i = 0; i < myList.length; i++) {
           System.out.printf("%.2f%s", myList[i], " ");
        }

        for (i = 0; i < 10; i++){

        }



    }


}
