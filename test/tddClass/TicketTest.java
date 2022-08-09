package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
    Ticket jerryTicket;

    @BeforeEach
    public void setUp(){
        jerryTicket = new Ticket(1);
        jerryTicket.setTicketId(1);
    }

    @Test
    void getTicketId(){
        assertEquals(1, jerryTicket.getTicketId());
    }


}
