package com.dietelProject.chapterSix;

import java.util.Scanner;
public class TemperatureConversion {


    public static double celsius(double kelvin){
        return kelvin - 273.15;
    }

    public static double kelvin(double celsius){
        return celsius + 273.15;
    }

    public static void display(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to enter a kelvin temperature or 2 to enter a celsius temperature");
        int a = scanner.nextInt();

        switch (a) {
            case 1 -> {
                System.out.println("Enter a kelvin temp: ");
                double kelvin = scanner.nextDouble();
                System.out.println(celsius(kelvin));
            }
            case 2 -> {
                System.out.println("Enter a celsius temp: ");
                double celsius = scanner.nextDouble();
                System.out.println(kelvin(celsius));
            }
        }
    }

    public static void main(String[] args) {
        display();
    }
}
