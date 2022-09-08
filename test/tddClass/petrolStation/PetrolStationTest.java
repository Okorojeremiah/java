package tddClass.petrolStation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetrolStationTest {

    PetrolStation jayBlinksOilAndGas;

    @BeforeEach
    public void setUp() {
        jayBlinksOilAndGas = new PetrolStation(500, "312, Herbert Macaulay Road, Sabo Yaba");
    }

    @Test
    public void testThatPetrolStationExist() {
        assertNotNull(jayBlinksOilAndGas);
    }

    @Test
    public void testThatFuelCanBeBought() {
        jayBlinksOilAndGas.buyFuel();
        assertTrue(true);
    }

    @Test
    public void testForNUmberOfLitreBought() {
        assertEquals(500, jayBlinksOilAndGas.getLitre());
    }

    @Test
    public void testForPriceOfLitresBought() {
        assertEquals(100000, jayBlinksOilAndGas.priceOfLitreBought());
    }

    @Test
    public void testForPriceAfterDiscount(){
        assertEquals(98000, jayBlinksOilAndGas.calculateDiscountPercentage());
    }
}
