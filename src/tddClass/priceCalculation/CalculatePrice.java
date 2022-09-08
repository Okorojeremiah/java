package tddClass.priceCalculation;

public class CalculatePrice {
    public int calculatePriceCopies(int numberOfCopies) {

        int price = 0;

        if (numberOfCopies>=1 && numberOfCopies <= 4) {
            price = numberOfCopies * 2000;
        }

        if (numberOfCopies >=5 && numberOfCopies<= 9) {
            price = numberOfCopies * 1800;
        }

        if (numberOfCopies >=10 && numberOfCopies <= 29) {
            price = numberOfCopies * 1600;
        }

        if (numberOfCopies >=30 && numberOfCopies <= 49) {
            price = numberOfCopies * 1500;
        }

        if (numberOfCopies >=50 && numberOfCopies<= 99) {
            price = numberOfCopies * 1300;
        }

        if (numberOfCopies >=100 && numberOfCopies <= 199) {
            price = numberOfCopies * 1200;
        }

        if (numberOfCopies>=200 && numberOfCopies <= 499) {
            price = numberOfCopies * 1100;
        }

        if (numberOfCopies >=500) {
            price = numberOfCopies * 1000;
        }

        return price;
    }


}
