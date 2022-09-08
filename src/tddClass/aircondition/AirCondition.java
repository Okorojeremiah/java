package tddClass.aircondition;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(isOn) validateTemperatureIncrease();
    }

    private void validateTemperatureIncrease(){
        if(temperature < 30 && temperature >= 16) temperature++;
    }

    public void decreaseTemperature() {
        validateTemperatureDecrease();
    }

    private void validateTemperatureDecrease(){
        if(temperature > 16) temperature--;
    }
}
