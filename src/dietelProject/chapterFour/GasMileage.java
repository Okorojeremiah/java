package dietelProject.chapterFour;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double totalMilesPerGallon = 0;
        double milesPerGallon;
        int miles;
        int gallons;
        int counter = 1;

        System.out.println("Enter the number of miles for" + " "+ counter + " trip or -1 to exit: ");
        miles = scan.nextInt();

        System.out.println("Enter the number of gallons used for" + " " + counter + " trip or -1 to exit: ");
        gallons = scan.nextInt();

        while(miles != -1) {
            milesPerGallon = (double)miles/gallons;
            totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;
            System.out.printf("The miles per gallon for %d trip is %.2f%n", counter, milesPerGallon);
            counter++;
            System.out.println("Enter the number of miles for" + " "+ counter + " trips or -1 to exit: ");
            miles = scan.nextInt();

            System.out.println("Enter the number of gallons used for" + " " + counter + " trips or -1 to exit: ");
            gallons = scan.nextInt();
        }
        System.out.printf("The total miles per gallons is %.2f",totalMilesPerGallon);
    }



}
