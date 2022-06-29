package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BikeTest {

    Bike powerBike;

    @BeforeEach
    public void setUp() {
        powerBike = new Bike();
    }

    @Test
    public void TestThatABikeCanBeCreated() {
        assertNotNull(powerBike);
    }

    @Test
    public void TestThatPowerBikeCanBeTurnedOn() {
        boolean on = powerBike.turnOn();
        assertNotNull(on);
    }

    @Test
    public void TestThatPowerBikeCanBeTurnOff() {
        boolean off = powerBike.turnOff();
        assertNotNull(off);
    }

    @Test
    public void TestForPowerBikeSpeedOnGearOne() {
        powerBike.setGear();
        powerBike.accelerate();
        assertEquals(1, powerBike.getSpeed());
    }

    @Test
    public void TestForPowerBikeOnGearTwo() {
        powerBike.setGear();
        powerBike.setGear();
        powerBike.setGear();
        powerBike.accelerate();
        powerBike.accelerate();
        assertEquals(4, powerBike.getSpeed());
    }

    @Test
    public void TestForPowerBikeOnGearThree() {
        powerBike.setGear();
        powerBike.setGear();
        powerBike.setGear();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        assertEquals(3, powerBike.getSpeed());
    }
    @Test
    public void TestForPowerBikeOnGearFour() {
        powerBike.setGear();
        powerBike.setGear();
        powerBike.setGear();
        powerBike.setGear();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        assertEquals(12, powerBike.getSpeed());


    }



}
