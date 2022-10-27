package tddClass.Reciept;

import java.util.ArrayList;

public class Order {
    private ArrayList<CheckOrder> orders;

    public Order(){
        orders = new ArrayList<>();
    }

    public void save(CheckOrder checkOrder) {
        orders.add(checkOrder);
    }

    public void displayOrder(){
        for (CheckOrder order : orders){
            System.out.print(order);
        }
    }

}
