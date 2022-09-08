package tddClass.flightReservation;

import java.util.Scanner;

public class FlightReservationSystem {

    private boolean[] airline = new boolean[10];

    public boolean checkSeatInAirline() {
        int number = 0;
        boolean result = false;
        for(int i = 0; i < airline.length; i++){
            if(airline[i] == false){
                number++;
            }
            if(number == 10){
                result = true;
            }
        }
        return result;
    }

    public boolean checkFirstClassSeat() {
        int number = 0;
        boolean result = false;
        for (int i = 0; i < (airline.length/2); i++){
            if (airline[i] == false){
                number++;
            }
            if (number == 5){
                result = true;
            }
        }
        return result;
    }

    public boolean checkEconomyClassSeat(){
        int number = 0;
        boolean result = false;
        for (int i = 5; i < airline.length; i++){
            if (airline[i] == false){
                number++;
            }
            if (number == 5){
                result = true;
            }
        }
        return result;
    }

    public void bookFlight(int userInput) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please type 1 for First Class and please type 2 for Economy: ");
//        userInput = input.nextInt();
        for (int i = 0; i < airline.length; ){
            switch (userInput){
                case 1:
                    if (airline[0] == false) {
                        airline[i] = true;
                        System.out.println("You have booked seat " + (i+1)+  " in First class");
                        i++;
                    }
//                case 2:
//                    if (userInput == 1){
//                        airline[1] = true;
//                        System.out.println("You have booked seat " + (i+1)+  " in First class");
//                        i++;
//                    }
//                    break;


            }
        }
    }
}
