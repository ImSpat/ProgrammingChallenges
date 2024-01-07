package FactorialExercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testIteration() {
        int[] expectedValues = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        for (int i = 0; i < 10; i++) {
            assertEquals(expectedValues[i], FactorialIteration.calculateFactorial(i));
        }
    }

    @Test
    public void testRecursion() {
        int[] expectedValues = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        for (int i = 0; i < 10; i++) {
            assertEquals(expectedValues[i], FactorialRecursion.calculateFactorial(i));
        }
    }
}
