package com.dietelProject.chapterTen.employeeApp1;

public class PayableTest {
    public static void main(String[] args) throws IllegalAccessException {
        Payable[] payables = new Payable[]{new Invoice("9872", " Volkswagen Engine", 2, 100_000), new Invoice("3456", "Yamaha plug", 2, 500), new SalariedEmployee("Jerry", "Okoro", "7868", 1500), new CommissionEmployee("lekan", "Adeolu", "0897", 0.07, 2000), new HourlyEmployee("Ebuka", "Osuji", "3456", 89, 30), new BaseEmployee("Gbenga", "Adebisi", "8765", 0.08, 3000, 40)};

        for (Payable payable : payables) {
            if (payable instanceof BaseEmployee){
                ((BaseEmployee) payable).setBaseSalary(0.1 * ((BaseEmployee) payable).getBaseSalary() + ((BaseEmployee) payable).getBaseSalary());
            }
            System.out.printf("%n%s %n%s: $%,.2f%n", payable, "Payable amount", payable.getPaymentAmount());
        }
    }


}
