package tddClass.bike;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear = 0;


    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){
        isOn = true;
        gear = 1;
    }

    public void turnOff() {
        isOn = false;
        gear = 0;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void increaseSpeed() {
       if(isOn)accelerate();

    }
    private void accelerate() {
                if (gear == 4) increaseSpeedOnGearFour();
                if(gear == 3) increaseSpeedOnGearThree();
                if( gear == 2) increaseSpeedOnGearTwo();
                if(gear == 1) increaseSpeedOnGearOne();
    }

    private void increaseSpeedOnGearOne() {
        speed++;
        if(speed > 20) gear++;
    }

    private void increaseSpeedOnGearTwo() {
        speed +=2;
        if(speed >= 31) gear++;
    }

    private void increaseSpeedOnGearThree() {
        speed+=3;
        if(speed >= 41) gear++;
    }

    private void increaseSpeedOnGearFour(){
        speed+=4;
    }



    public void decreaseSpeed() {
        if(isOn)deccelerate();
    }

    private void deccelerate() {
        if(gear == 1) decreaseSpeedOnGearOne();
        if( gear == 2) decreaseSpeedOnGearTwo();
        if(gear == 3) decreaseSpeedOnGearThree();
        if (gear == 4) decreaseSpeedOnGearFour();
    }

    private void decreaseSpeedOnGearOne() {
        speed--;
        if(speed < 0) speed = 0;
    }

    private void decreaseSpeedOnGearTwo() {
        speed -=2;
        if(speed < 21) gear--;
    }

    private void decreaseSpeedOnGearThree() {
        speed-=3;
        if(speed < 31) gear--;
    }

    private void decreaseSpeedOnGearFour(){
        speed-=4;
        if (speed < 41) gear--;
    }
}


