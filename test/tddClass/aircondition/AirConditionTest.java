package tddClass.aircondition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    AirCondition airCondition;

    @BeforeEach
    public void startWith(){
        airCondition = new AirCondition();
    }

    @Test
    public void testThatAirConditionCanBeTurnOn(){
        AirCondition airCondition = new AirCondition();
        boolean isOn = airCondition.isOn();
        assertFalse(isOn);
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
    }

    @Test
    public void testThatAirConditionCanBeTurnedOff(){
        AirCondition airCondition = new AirCondition();
        airCondition.turnOff();
        assertFalse(airCondition.isOn());
    }

    @Test
    public void temperatureCanIncreaseByOneTest(){
        airCondition.turnOn();
        assertEquals(16, airCondition.getTemperature());
        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());
    }

    @Test
    public void temperatureCanDecreaseByOneTest(){
        airCondition.turnOn();
        airCondition.increaseTemperature();
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());
    }

    @Test
    public void temperatureCannotIncreaseBeyondThirtyTest(){
        airCondition.turnOn();
        for(int i = 0; i < 20; i++){
            airCondition.increaseTemperature();
        }
        assertEquals(30, airCondition.getTemperature());
    }

    @Test
    public void temperatureCannotReduceBelowSixteenTest(){
        airCondition.turnOn();
        assertEquals(16, airCondition.getTemperature());
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());
    }

    @Test
    public void temperatureCannotIncreaseWhenItIsOffTest(){
        assertFalse(airCondition.isOn());
        airCondition.increaseTemperature();
        assertEquals(16, airCondition.getTemperature());
    }

    @Test
    public void temperatureCannotDecreaseWhenItIsOffTest(){
        assertFalse(airCondition.isOn());
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());
    }

    @DisplayName("Given i put on my air condition, when i put it back on, it should still remain at it's previous temperature")
    @Test
    public void AirConditionRemainsInItPreviousTemperatureBeforeItWasPutOffTest(){
        airCondition.turnOn();
        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());
        airCondition.turnOff();
        airCondition.turnOn();
        assertEquals(17, airCondition.getTemperature());
    }

}
