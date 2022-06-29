package tddClass;

public class Bike {
    private int speed;
    private int gear;

    public void setGear() {
        this.gear = gear + 1;
    }


    public void accelerate() {
        if (this.gear == 1) {
            this.speed = speed + 1;
        }
        if (this.gear == 2) {
            this.speed = speed + 2;
        }
        if (this.gear == 3) {
            this.speed = speed + 3;
        }
        if (this.gear == 4) {
            this.speed = speed + 4;
        }


        if (this.speed >= 0 && this.speed <=20) {
            this.gear = 1;
        }
        if (this.speed >= 21 && this.speed < 30) {
            this.gear = 2;
        }
        if (this.speed >= 31 && this.speed < 40) {
            this.gear = 3;
        }
        if (this.speed == 41 && this.speed > 41) {
            this.gear = 4;
        }
    }

    public void decelerate() {
        if (gear == 1) {
            this.speed = speed - 1;
        }
        if(gear == 2) {
            this.speed = speed - 2;
        }
        if (gear == 3) {
            this.speed = speed - 3;
        }
        if (gear == 4) {
            this.speed = speed - 4;
        }
        if (gear <= 0) {
            this.speed = 0;
        }
    }

    public int gearChange(int speed) {
        if (speed >= 0 && speed <= 20) {
            this.gear = 1;
        }
        return speed;
    }

    public int getSpeed(){
        return speed;
    }


    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return false;
    }
}
