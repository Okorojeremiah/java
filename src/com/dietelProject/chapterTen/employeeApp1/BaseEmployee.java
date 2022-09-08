package com.dietelProject.chapterTen.employeeApp1;

public class BaseEmployee extends CommissionEmployee {

    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSale, double baseSalary) throws IllegalAccessException {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSale);
        this.baseSalary = baseSalary;
        if (baseSalary < 0.0){
            throw new IllegalAccessException("Base salary must be greater than 0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) throws IllegalAccessException {
        this.baseSalary = baseSalary;
        if (baseSalary < 0.0){
            throw new IllegalAccessException("Base salary must be greater than 0");
        }
    }
    @Override
    public double getPaymentAmount(){
        return super.getPaymentAmount() + getBaseSalary();
    }

    @Override
    public String toString(){
        return String.format("%s %n%s: %.2f %n%s: %.2f", super.toString(), "Salary", getBaseSalary(), "Base salary", getPaymentAmount());
    }
}
