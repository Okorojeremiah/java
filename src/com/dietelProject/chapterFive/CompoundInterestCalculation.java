package com.dietelProject.chapterFive;

public class CompoundInterestCalculation {

    public static void main(String[] args) {

        double rate = 0.05;
        double principal = 1000.0;

        int numOfYears = 10;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for(int year = 1; year <= numOfYears; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);

        }
    }
}
