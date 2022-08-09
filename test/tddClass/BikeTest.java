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
    public void TestToCheckIfGearCanIncrease() {
        powerBike.increaseGear();
        assertEquals(1, powerBike.getGear());
    }

    @Test
    public void TestToCheckIfGearCanIncreaseAbove4() {
        powerBike.increaseGear();
        powerBike.increaseGear();
        powerBike.increaseGear();
        powerBike.increaseGear();
        powerBike.increaseGear();
        assertEquals(4, powerBike.getGear());
    }

    @Test
    public void TestToCheckIfGearCanDecreaseBelow1() {
        powerBike.increaseGear();
        powerBike.decreaseGear();
        assertEquals(0, powerBike.getGear());
    }

    @Test
    public void TestThatPowerBikeCanAccelerate() {
        powerBike.increaseGear();

        assertEquals(0, powerBike.getSpeed());
        assertEquals(1, powerBike.getGear());
    }
    @Test
    public void TestThatPowerBikeCanDecelerate() {
        powerBike.increaseGear();
        powerBike.increaseGear();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.decelerate();
        assertEquals(2, powerBike.getSpeed());
        assertEquals(1, powerBike.getGear());


    }



}
