package dietelProject.chapterTen.carbonFootPrint;

public class Building implements CarbonFootprint{
    private String ownerFirstName;
    private String ownerLastName;
    private String address;
    private double petrolConsumption;

    public Building(String ownerFirstName, String ownerLastName, String address, double petrolConsumption){
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.address = address;
        this.petrolConsumption = petrolConsumption;
    }

    @Override
    public void getCarbonFootPrint() {

    }
}
