package com.dietelProject.chapterFour;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
           calculateSalesCommission();
    }
    private static final Scanner scanner = new Scanner(System.in);


    public static void calculateSalesCommission(){
        displayItems();
        double itemPrice = getItemPrice();

        double totalPrice = 0;
        double weeklyEarnings = 200;
        double earningCommission = 0.09;

        while (itemPrice != -1){
            totalPrice+=itemPrice;
            itemPrice = getItemPrice();
        }

        double totalWeeklyEarnings = weeklyEarnings + (totalPrice * earningCommission);

        displayEarnings(totalWeeklyEarnings);
    }

    private static void displayEarnings(double totalWeeklyEarnings) {
        System.out.printf("%s%.2f", "Your total weekly earnings is: ", totalWeeklyEarnings);
    }

    private static double getItemPrice() {
        System.out.println("Enter item price or -1 to exit");
        return scanner.nextDouble();
    }

    private static void displayItems() {
        String items = """
                1. Item 1 (price: 239.99)
                2. Item 2 (129.75)
                3. Item 3 (99.95)
                4. Item 350 (350.89)
                """;
        System.out.println(items);
    }

}
