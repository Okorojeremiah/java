package com.dietelProject.chapterTen.carbonFootPrint;

public class Building implements CarbonFootprint{
    private String ownerFirstName;
    private String ownerLastName;
    private String address;
    private double petrolConsumption;
    private double electricityConsumption;
    private double cookingGasConsumption;

    public Building(String ownerFirstName, String ownerLastName, String address, double petrolConsumption, double electricityConsumption, double cookingGasConsumption){
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.address = address;
        this.petrolConsumption = petrolConsumption;
        this.cookingGasConsumption = cookingGasConsumption;
        this.electricityConsumption = electricityConsumption;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPetrolConsumption() {
        return petrolConsumption;
    }

    public void setPetrolConsumption(double petrolConsumption) {
        this.petrolConsumption = petrolConsumption;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(double electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public double getCookingGasConsumption() {
        return cookingGasConsumption;
    }

    public void setCookingGasConsumption(double cookingGasConsumption) {
        this.cookingGasConsumption = cookingGasConsumption;
    }

    @Override
    public double getCarbonFootPrint() {
        double carbonFootPrintPerHomeElectricity = 5.139;
        double carbonFootprintPrintPerCubicFootOfCookingGas = 2.29;
        return 0;
    }
}
