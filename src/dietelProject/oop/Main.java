package dietelProject.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human baby = new Human();

        multiplier();

    }

    public static void multiplier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if(num > 0){
            for (int i = 1; i <= 12; i++) {
                System.out.println(num +" * "+i +" = "+i *num);
            }
        }else{
            System.out.println("Cannot multiply zeros");
        }
    }
}
