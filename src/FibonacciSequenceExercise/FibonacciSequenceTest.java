package FibonacciSequenceExercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest {

    @Test
    public void testRecursion() {
        int[] expectedResults = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        for (int i = 0; i <= 12; i++) {
            assertEquals(expectedResults[i], FibonacciSequenceRecursion.calculateNthElementOfFibonacciSeries(i));
        }
    }

    @Test
    public void testIterative() {
        int[] expectedResults = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        for (int i = 0; i <= 12; i++) {
            assertEquals(expectedResults[i], FibonacciSequenceIterative.calculateNthElementOfFibonacciSeries(i));
        }
    }
}

