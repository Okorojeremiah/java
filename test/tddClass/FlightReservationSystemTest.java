package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightReservationSystemTest {

    FlightReservationSystem jayblinksAirLine;

    @BeforeEach
    void setUp(){
        jayblinksAirLine = new FlightReservationSystem();
    }

    @Test
    void testThatAirlineExist(){
        assertNotNull(jayblinksAirLine);
    }

    @Test
    void testThatSeatExistInTheAirline(){
        boolean checkSeat = jayblinksAirLine.checkSeatInAirline();
        assertTrue(checkSeat);
    }

    @Test
    void testThatFirstClassSeatExist(){
        boolean checkFirstClassSeat = jayblinksAirLine.checkFirstClassSeat();
        assertTrue(checkFirstClassSeat);
    }

    @Test
    void testThatEconomyClassSeatExist(){
        boolean checkEconomyClassSeat = jayblinksAirLine.checkEconomyClassSeat();
        assertTrue(checkEconomyClassSeat);
    }

    @Test
    void testThatSeatCanBeBooked(){
        jayblinksAirLine.bookFlight(1);
    }


}
