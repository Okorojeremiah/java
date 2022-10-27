package tddClass.Reciept;

public class CheckOrder {
    private String cashierName;
    private String product;

    public CheckOrder(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    private double price;
    private int quantity;


    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotal() {
        return price * quantity;
    }

    public String toString() {

        return String.format("%24s%16d%16f%16f%n", product, quantity, price, getTotal());
    }
}
