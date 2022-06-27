package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

    @Test
    public void turnOn() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        boolean isOn = panasonic.turnOn();
        //check
        assertTrue(isOn);
    }

    @Test
    public void turnOff() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        boolean isOff = panasonic.turnOff();
        //check
        assertFalse(isOff);
    }

    @Test
    public void increaseTemperature() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        panasonic.increaseTemperature(18);
        //assert
        assertEquals(19, panasonic.getTemperature());
    }

    @Test
    public void decreaseTemperature() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        panasonic.decreaseTemperature(17);
        //assert
        assertEquals(16, panasonic.getTemperature());
    }



}