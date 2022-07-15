package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatePriceTest {

    CalculatePrice calculate;

    @BeforeEach
    public void setUp() {
        calculate = new CalculatePrice();
    }

    @Test
    public void testToCalculateCopyRange() {
        int result = calculate.calculatePriceCopies(10);
        assertEquals(16000, result);
    }
}
