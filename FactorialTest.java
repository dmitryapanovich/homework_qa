import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testForZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testForPositiveNumber() {
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(2, Factorial.calculateFactorial(2));
        assertEquals(6, Factorial.calculateFactorial(3));
        assertEquals(24, Factorial.calculateFactorial(4));
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    void testForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}