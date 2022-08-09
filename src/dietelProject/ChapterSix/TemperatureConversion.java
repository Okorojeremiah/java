package dietelProject.ChapterSix;

import java.util.Scanner;
public class TemperatureConversion {

    public static void kelvin(double k){
        double celsius = k - 273.15; //converts the kelvin temperature entered into a celsius temperature
        System.out.printf("%s%.2f", "The celsius equivalent is ", celsius);
    }

    public static void celsius(double c){
        double kelvin = c + 273.15; //converts the celsius temperature entered into a kelvin temperature
        System.out.printf("%s%.2f", "The kelvin equivalent is ", kelvin);
    }

    public static void display(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to enter a kelvin temperature or 2 to enter a celsius temperature");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("Enter a kelvin temp: ");
                double kelvin = scanner.nextDouble();
                kelvin(kelvin);
                break;
            case 2:
                System.out.println("Enter a celsius temp: ");
                double celsius = scanner.nextDouble();
                celsius(celsius);
                break;
        }
    }

    public static void main(String[] args) {
        display();
    }
}
