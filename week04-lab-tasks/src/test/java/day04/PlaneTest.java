package day04;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PlaneTest {
    @Test
    void planeClassTest() {
        Plane plane = new Plane(20);

        for (int i = 0; i < 20; i++) {
            plane.addPassanger(new Passenger("Name" + i,"TN000"+i,new Random(1).nextInt(0,2)));
        }
        assertEquals(20, plane.numberOfPackages());
        assertEquals(20, plane.numberOfPassengers());
        assertFalse(plane.addPassanger(new Passenger("Anonym","No ticket",0)));
    }
}
