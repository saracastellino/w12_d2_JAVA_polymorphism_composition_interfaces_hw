package com.babycastles.attractions;

import org.junit.Before;
import org.junit.Test;
import com.babycastles.people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowVistors() {
        Visitor visitor1 = new Visitor(23, 180, 20 );
        assertTrue(rollerCoaster.isAllowedTo(visitor1));
    }
}
