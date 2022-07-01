package dietelProject.chapterThree;
import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
      Car benz = new Car("E-200 Class", 4000000, "2022");
      Car toyota = new Car("Camry", 2000000, "2022");

      System.out.printf("The price of %s benz %s is %f%n%n",benz.getYear(), benz.getModel(), benz.getPrice());
      System.out.printf("The price of %s benz %s is %f%n%n",toyota.getYear(), toyota.getModel(), toyota.getPrice());

      double discountPriceForBenz = benz.discountPriceFivePercent();
      double discountPriceForToyota = toyota.discountPriceSevenPercent();

      System.out.printf("Price of %s benz %s after five percent discount is %f%n%n", benz.getYear(), benz.getModel(), discountPriceForBenz);
      System.out.printf("Price of %s benz %s after seven percent discount is %f%n%n", benz.getYear(), benz.getModel(), discountPriceForToyota);
    }
}
