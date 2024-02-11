package laskin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LaskinTest {

    private Laskin laskin;

    @BeforeEach
    public void setUp() {
        laskin = new Laskin();
    }

    @Test
    public void testAdd() {
        laskin.add(5);
        assertEquals(5, laskin.getResult());
    }

    @Test
    public void testSubtract() {
        laskin.add(5); // Set result to 5
        laskin.subtract(3);
        assertEquals(2, laskin.getResult());
    }

    @Test
    public void testMultiply() {
        laskin.add(5); // Set result to 5
        laskin.multiply(2);
        assertEquals(10, laskin.getResult());
    }

    @Test
    public void testDivide() {
        laskin.add(10); // Set result to 10
        laskin.divide(2);
        assertEquals(5, laskin.getResult());
    }

    @Test
    public void testDivideByZero() {
        laskin.add(10); // Set result to 10
        Exception exception = assertThrows(IllegalArgumentException.class, () -> laskin.divide(0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    public void testSquare() {
        laskin.square(3);
        assertEquals(9, laskin.getResult());
    }

    @Test
    public void testON() {
        laskin.ON();
        assertEquals(0, laskin.getResult());
    }

    @Test
    public void testOFF() {
        laskin.OFF();
        assertEquals(0, laskin.getResult());
    }
    
}
