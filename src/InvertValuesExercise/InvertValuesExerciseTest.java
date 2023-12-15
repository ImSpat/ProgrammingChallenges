package InvertValuesExercise;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InvertValuesExerciseTest {
    @Test
    public void tests() {
        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {-1,2,-3,4,-5};
        expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {};
        expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }
}
