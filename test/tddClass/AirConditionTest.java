package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

    @Test

    public void testThatAirConditionCanBeCreated() {
        AirCondition panasonic = new AirCondition();
        assertNotNull(panasonic);
    }

    @Test
    public void testThatAirConditionCanBeTurnOn() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        boolean isOn = panasonic.turnOn();
        //check
        assertTrue(isOn);
    }

    @Test
    public void testThatAirConditionCanBeTurnOff() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        boolean isOff = panasonic.turnOff();
        //check
        assertFalse(isOff);
    }

    @Test
    public void testThatTemperatureCanIncrease() {
        //given
        AirCondition panasonic = new AirCondition();
        //when
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        //check
        assertEquals(18, panasonic.getTemperature());
    }
    @Test
    public void testThatTemperatureCanDecrease() {
        //given
        AirCondition panasonic = new AirCondition();
        //when
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.decreaseTemperature();
        //check
        assertEquals(17, panasonic.getTemperature());
    }

    @Test
    public void testThatTemperatureCanNotIncreaseBeyond30() {
        //given
        AirCondition panasonic = new AirCondition();
        //when
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        //assert
        assertEquals(30, panasonic.getTemperature());
    }

    @Test
    public void testThatTemperatureDecreaseBeyond16() {
        //when
        AirCondition panasonic = new AirCondition();
        //given
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        //assert
        assertEquals(16, panasonic.getTemperature());
    }



}