package combine_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prog5Test {

    @Test
    void combine() {
        int[] expected = {5,6,-4,3,1,3,8,9,11};
        assertArrayEquals(expected, Prog5.combine(new int[]{5,6,-4,3,1}, new int[]{3,8,9,11}), "Should be combined");
    }
}