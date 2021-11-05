package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {
    @Test
    void passengerClassTest(){
        Passenger p1 = new Passenger("Jon Doe","ABCD1234-1234",0);
        assertEquals("Jon Doe", p1.getName());
        assertEquals("ABCD1234-1234", p1.getTicketId());
        assertEquals(0, p1.getNumberOfPackages());
    }
}
