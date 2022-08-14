package dietelProject.chapterTen.carbonFootPrint;

public class Car implements CarbonFootprint{
    private String colour;
    private String plateNumber;
    private String ownerFirstName;
    private String ownerLastName;
    private String carName;
    private double miles;

    public Car(String colour, String plateNumber, String ownerFirstName, String ownerLastName, String carName, double miles){
        this.carName = carName;
        this.colour = colour;
        this.ownerLastName = ownerLastName;
        this.miles = miles;
        this.plateNumber = plateNumber;
        this.ownerFirstName = ownerFirstName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
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

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getCarbonFootPrint() {
        double carbonDioxideEmittedPerMile = 0.000403; //Constant gotten from https://www.epa.gov/energy/greenhouse-gases-equivalencies-calculator-calculations-and-references#miles
        double carbonFootPrint = getMiles() * carbonDioxideEmittedPerMile;
        return carbonFootPrint;
    }
}
