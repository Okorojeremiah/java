package dietelProject.oop;

import java.util.Objects;
import java.util.Scanner;

public class SalesCommissionCalculatorOop {
    private static Scanner scanner = new Scanner(System.in);

    public static void runSalesCommissionCalculator(){
        double result = sumAllSales();
        calculateCommission(result);
    }
    private static double sumAllSales(){

        double totalSaleAmount = 0;
        double amount = 0.0;
        System.out.println("Enter sale amount or -1 to stop");
        amount = scanner.nextDouble();
        while (amount != -1){
            totalSaleAmount += amount;
            System.out.println("Enter sale amount or -1 to stop");
            amount = scanner.nextDouble();
        }
        return totalSaleAmount;
    }

    private static void calculateCommission(double totalSale){
        System.out.println("What is the percentage value? ");
        double percentValue = scanner.nextDouble();

        System.out.println("How much is the weekly pay?");
        double weeklyPay = scanner.nextDouble();
        double actualValue = actualPercentageAmount(percentValue, totalSale);
        System.out.println("The sales commission is "+(actualValue + weeklyPay));
    }

    private static double actualPercentageAmount(double percentage, double value){
        return value * (percentage / 100);
    }

    public static void main(String[] args) {
       runSalesCommissionCalculator();
    }
}
