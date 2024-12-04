package recursion.exponent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ExponentialTest {
    @Test
    @DisplayName("Exponential Test Cases")
    void power() {
        Exponential exp = new Exponential();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> exp.power(9,-1));

        assertAll("Exponential",
                () -> assertEquals(1024.0, exp.power(2, 10), "2^10 should be 1024"),
                () -> assertEquals(27.0, exp.power(3, 3), "3^3 should be 27"),
                () -> assertEquals(1.0, exp.power(7, 0), "7^0 should be 1"),
                () -> assertEquals("Exponent must be non-negative", exception.getMessage())

        );
    }
}