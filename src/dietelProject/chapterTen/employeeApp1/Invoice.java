package dietelProject.chapterTen.employeeApp1;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) throws IllegalAccessException {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

        if (quantity < 0){
            throw new IllegalAccessException("Quantity cannot be less than 0");
        }

        if (pricePerItem < 0.0){
            throw new IllegalAccessException("Price cannot be less than 0");
        }
    }
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString(){
        return String.format("%s: %n%s: %s %n%s: %s %n%s: %d %n%s: $%,.2f","Invoice", "Part number", getPartNumber(), "Part description", getPartDescription(), "Quantity", getQuantity(), "Price per item", getPricePerItem());
    }
}
