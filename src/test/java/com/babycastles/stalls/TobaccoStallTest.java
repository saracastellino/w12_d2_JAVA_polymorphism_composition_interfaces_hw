package com.babycastles.stalls;

import org.junit.Before;
import org.junit.Test;
import com.babycastles.people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", 8, "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(8, tobaccoStall.getRating());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAllowVistors() {
        Visitor visitor1 = new Visitor(23, 180, 20 );
        assertTrue(tobaccoStall.isAllowedTo(visitor1));
    }
}
