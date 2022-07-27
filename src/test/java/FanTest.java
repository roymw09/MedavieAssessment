package test.java;

import main.java.Fan;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FanTest {

    Fan fan;

    @Before
    public void setUp() {
        fan = new Fan();
    }

    @Test
    public void testSpeed() {
        fan.increaseSpeed();
        assertEquals(1, fan.getSpeed());

        fan.increaseSpeed();
        assertEquals(2, fan.getSpeed());

        fan.increaseSpeed();
        assertEquals(3, fan.getSpeed());

        fan.increaseSpeed();
        assertEquals(0, fan.getSpeed());
    }

    @Test
    public void testSpeedDirection() {
        fan.reverseSpeedDirection();
        assertTrue(fan.getReversed());

        fan.increaseSpeed();
        assertEquals(3, fan.getSpeed());

        fan.increaseSpeed();
        assertEquals(2, fan.getSpeed());

        fan.reverseSpeedDirection();
        assertFalse(fan.getReversed());

        fan.increaseSpeed();
        assertEquals(3, fan.getSpeed());

        fan.reverseSpeedDirection();
        assertTrue(fan.getReversed());

        fan.increaseSpeed();
        assertEquals(2, fan.getSpeed());

        fan.increaseSpeed();
        assertEquals(1, fan.getSpeed());

        fan.increaseSpeed();
        assertEquals(0, fan.getSpeed());
    }
}
