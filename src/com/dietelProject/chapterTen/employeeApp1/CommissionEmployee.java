package com.dietelProject.chapterTen.employeeApp1;

public class CommissionEmployee extends Employee {

    private double commissionRate;
    private double grossSale;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSale) throws IllegalAccessException {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
        if (commissionRate <= 0 || commissionRate >= 0.1){
            throw new IllegalAccessException("commission rate must be between 0.0 and 0.1");
        }
        if(grossSale < 0.0){
            throw new IllegalAccessException("gross rate must be greater than 0");
        }
    }

    public void setCommissionRate(double commissionRate) throws IllegalAccessException {
        this.commissionRate = commissionRate;
        if (commissionRate <= 0 || commissionRate >= 0.1){
            throw new IllegalAccessException("commission rate must be between 0.0 and 0.1");
        }

    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) throws IllegalAccessException {
        this.grossSale = grossSale;
        if(grossSale < 0.0){
            throw new IllegalAccessException("gross rate must be greater than 0");
        }
    }
    @Override
    public double getPaymentAmount(){
        return getGrossSale() * getCommissionRate();
    }

    @Override
    public String toString(){
        return String.format("%s %n%s: %.2f %n%s: %.2f", super.toString(), "Gross sales", getGrossSale(), "Commission rate", getCommissionRate());
    }

}
