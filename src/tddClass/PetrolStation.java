package tddClass;

public class PetrolStation {

    private String location;
    private final double fuelPricePerlitre = 200;
    private int litre;


    public PetrolStation(int litre, String location) {
        this.litre = litre;
        this.location = location;
    }

    public boolean buyFuel() {
        return true;
    }

    public int getLitre() {
        return litre;
    }

    public double priceOfLitreBought() {
        double litreBought = getLitre();
        double amount = litreBought * fuelPricePerlitre;
        return amount;
    }

    public double calculateDiscountPercentage() {
        double discountAmount = priceOfLitreBought() * 2 / 100;
        double priceAfterDiscount = priceOfLitreBought() - discountAmount;
        return priceAfterDiscount;
    }

}
