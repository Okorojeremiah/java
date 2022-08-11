package dietelProject.chapterSix;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int i = 1;
        int countOfPrimeNumbers = 0;

        while(i <= 10000){
            boolean result = isPrimeNumber(i);
            if(result){
                System.out.println(i);
                countOfPrimeNumbers++;
            }
            i++;
        }
        System.out.println("There are "+countOfPrimeNumbers+" prime numbers between 1 and 10,000 ");
//        primeNumber();
//        System.out.println(isPrimeNumber(8));
    }

    public static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number == 2) {
            System.out.println(number + " is a prime number");
        }
        if (number > 2) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                    break;
                }
                if (i == number - 1) {
                    System.out.println(number + " is a prime number");
                }

            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2) {
            return true;
        }
        if (number > 2) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
                if (i == number - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void isPrime(int number){
        if (number == 2) {
            System.out.println(number +" is a prime number");
        }
        if (number > 2) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    continue;
                }
                if (i == number - 1) {
                    System.out.println(number +" is a prime number");
                }
            }
        }
    }
}
