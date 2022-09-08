package tddClass.petrolStation;

public class PetrolStation {

    private final double fuelPricePerlitre = 200;
    private int litre;


    public PetrolStation(int litre, String location) {
        this.litre = litre;
    }

    public boolean buyFuel() {
        return true;
    }

    public int getLitre() {
        return litre;
    }

    public double priceOfLitreBought() {
        double litreBought = getLitre();
        return litreBought * fuelPricePerlitre;
    }

    public double calculateDiscountPercentage() {
        double discountAmount = priceOfLitreBought() * 2 / 100;
        return priceOfLitreBought() - discountAmount;
    }

}
