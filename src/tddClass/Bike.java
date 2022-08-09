package tddClass;

public class Bike {
    private int speed = -1;
    private int gear = 0;

    public void increaseGear() {
        gear = gear + 1;
        if (gear > 4) {
            gear = 4;
        }
    }
    public void decreaseGear() {
        gear = gear - 1;
        if (gear < 0) {
            gear = 0;
        }
    }
    public int getGear() {
        return gear;
    }


    public void accelerate() {
        if (gear == 1) {
            speed = speed + 1;
        } else if (gear == 2) {
            speed = speed + 2;
        } else if (gear == 3) {
            speed = speed + 3;
        } else if (gear == 4) {
            speed = speed + 4;
        } else {
            speed = 0;
        }
        if (speed < 0) {
            speed = 0;
        }

//        if (speed >= 0 && speed <=20) {
//            gear = 1;
//        }
//        if (speed > 20 && speed <= 30) {
//            gear = 2;
//        }
//        if (speed > 30 && speed <= 40) {
//            gear = 3;
//        }
//        if (speed > 40) {
//            gear = 4;
//        }

    }

    public void decelerate() {
        if (gear == 1) {
            speed = speed - 1;
        }
        if(gear == 2) {
            speed = speed - 2;
        }
        if (gear == 3) {
            speed = speed - 3;
        }
        if (gear == 4) {
            speed = speed - 4;
        }
        if (gear <= 0) {
            speed = 0;
        }
        if (speed < 0) {
            speed = 0;
        }
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
