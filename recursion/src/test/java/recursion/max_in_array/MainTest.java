package recursion.max_in_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import recursion.problem_five.Main;
class MainTest {
    @Test
    void getMaxValue_postiveNumbers() {
        assertEquals(12, Main.getMaxValue(new int[]{5,7,8,10,12,11}), "should return 12");
    }
    @Test
    void getMaxValue_negativeNumbers() {
//        Main main = new Main();
        int[] arr = {-1, -2, -3, -4, -5};
        assertEquals(-1, Main.getMaxValue(arr), "Max value in {-1, -2, -3, -4, -5} should be -1");
    }

    @Test
    void getMaxValue_mixedNumbers() {
        int[] arr = {-1, 0, 5, 3, -2};
        assertEquals(5, Main.getMaxValue(arr), "Max value in {-1, 0, 5, 3, -2} should be 5");
    }

    @Test
    void getMaxValue_singleElement() {
        int[] arr = {42};
        assertEquals(42, Main.getMaxValue(arr), "Max value in {42} should be 42");
    }

    @Test
    void getMaxValue_emptyArray() {
        int[] arr = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.getMaxValue(arr));
        assertEquals("Array must not be null or empty", exception.getMessage());
    }
}