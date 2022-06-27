package tddClass;


public class AirCondition {

    private int temperature;


    public AirCondition() {
    }

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return false;
    }

    public void increaseTemperature(int temperature) {
        if (temperature >= 16 && temperature <= 30) {
            this.temperature = temperature + 1;
        } else if (temperature < 16) {
            this.temperature = 16;
        } else {
            this.temperature = 30;
        }
    }
    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int temperature) {
        if (temperature >= 16 && temperature <= 30) {
            this.temperature = temperature - 1;
        } else if (temperature < 16) {
            this.temperature = 16;
        } else {
            this.temperature = 30;
        }
    }
}

