package com.dietelProject.chapterThree;

public class Car {
    private String model;
    private double price;
    private String year;

    public Car(String model, double price, String year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public void setModel( String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public double discountPriceFivePercent() {
        double percentage = 0.05;
        double discountAmount = this.price * percentage;
        double priceAfterDiscount = this.price - discountAmount;
        return priceAfterDiscount;
    }


    public double discountPriceSevenPercent() {
        double percentage = 0.07;
        double discountAmount = this.price * percentage;
        double priceAfterDiscount = this.price - discountAmount;
        return priceAfterDiscount;
    }
}
