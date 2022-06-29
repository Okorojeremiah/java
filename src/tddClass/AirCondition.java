package tddClass;


public class AirCondition {
    private int temperature = 16;

    public boolean turnOn() {
        return true;
    }
    public boolean turnOff() {
        return false;
    }

    public void increaseTemperature() {
        this.temperature = temperature + 1;
        if (this.temperature > 30) {
            this.temperature = 30;
        }
    }

    public void decreaseTemperature() {
        this.temperature = temperature - 1;
        if (this.temperature < 16) {
            this.temperature = 16;
        }
    }



//    public void increaseTemperature() {
//        if (temperature >= 16 && temperature <= 30) {
//            this.temperature = temperature + 1;
//        } else if (temperature < 16) {
//            this.temperature = 16;
//        } else {
//            this.temperature = 30;
//        }
//    }
    public int getTemperature() {
        return temperature;
    }



//    public void decreaseTemperature() {
//        if (temperature >= 16 && temperature <= 30) {
//            this.temperature = temperature - 1;
//        } else if (temperature < 16) {
//            this.temperature = 16;
//        } else {
//            this.temperature = 30;
//        }
//    }
}

