package dietelProject.ChapterSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Shopping shop = new Shopping("bread", 2, 500, 1000);

        List<Shopping> products = new ArrayList<>();

        char nextProduct;
        double total;
        double subTotal = 0;
        double vat;
        double discountAmount;
        double billTotal;
        double balance;

        System.out.println("What is the customer's name?");
        String customerName = scan.nextLine();
        shop.setCustomerName(customerName);

        do {
            System.out.println("What did the user buy?");
            String productName = scan.nextLine();
            shop.setProduct(productName);

            System.out.println("How many pieces?");
            int quantity = scan.nextInt();
            shop.setQuantity(quantity);

            System.out.println("How much per unit?");
            double price = scan.nextDouble();
            shop.setPrice(price);

            total = shop.getPrice() * shop.getQuantity();
            subTotal = subTotal + total;

            products.add(new Shopping(productName, quantity, price, total));

            System.out.println("Want to add more product (Yes/No)?");
            nextProduct = scan.next().charAt(0);
            scan.nextLine();
        }

        while (nextProduct == 'Y'|| nextProduct == 'y');
        System.out.println("What is your name?");
        String cashierName = scan.nextLine();
        shop.setCashierName(cashierName);

        System.out.println("How much discount will he/she gets?");
        double discount = scan.nextDouble();
        shop.setDiscount(discount);

        System.out.println("\nJERRY STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 0810158612");
        System.out.println("Cashier: " + shop.getCashierName());
        System.out.println("Customer Name: " + shop.getCustomerName());
        System.out.println("===========================================================================");
        System.out.printf("%24s%16s%16s%16s%n", "ITEM", "QTY", "PRICE", "TOTAL");
        System.out.println("---------------------------------------------------------------------------");
        for (Shopping a : products) {
            a.displayList();
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%36s%16f%n", "Sub Total:", subTotal);
        discountAmount = (shop.getDiscount()/100) * subTotal;
        System.out.printf("%36s%16f%n", "Discount:", discountAmount);
        vat = subTotal * (17.50/100);
        System.out.printf("%36s%16f%n", "VAT @ 17.50%:", vat);
        System.out.println("===========================================================================");
        billTotal = subTotal + vat - discountAmount;
        System.out.printf("%36s%16f%n", "Bill Total:", billTotal);
        System.out.println("===========================================================================");
        System.out.println("\t\t\tTHIS IS NOT A RECEIPT, KINDLY PAY " + billTotal);
        System.out.println("===========================================================================");

        System.out.println("How much did the customer give you?");
        double amountPaid = scan.nextDouble();
        shop.setAmountPaid(amountPaid);

        System.out.println("\nJERRY STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 0810158612");
        System.out.println("Cashier: " + shop.getCashierName());
        System.out.println("Customer Name: " + shop.getCustomerName());
        System.out.println("===========================================================================");
        System.out.printf("%24s%16s%16s%16s%n", "ITEM", "QTY", "PRICE", "TOTAL");
        System.out.println("---------------------------------------------------------------------------");
        for (Shopping a : products) {
            a.displayList();
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%36s%16f%n", "Sub Total:", subTotal);
        System.out.printf("%36s%16f%n", "Discount:", discountAmount);
        System.out.printf("%36s%16f%n", "VAT @ 17.50%:", vat);
        System.out.println("===========================================================================");
        System.out.printf("%36s%16f%n", "Bill Total:", billTotal);
        System.out.printf("%36s%16f%n", "Amount Paid:", shop.getAmountPaid());
        balance = shop.getAmountPaid() - billTotal;
        System.out.printf("%36s%16f%n", "Balance:", balance);
        System.out.println("===========================================================================");
        System.out.println("\t\t\t\tTHANK YOU FOR YOUR PATRONAGE");
        System.out.println("===========================================================================");


    }

}
