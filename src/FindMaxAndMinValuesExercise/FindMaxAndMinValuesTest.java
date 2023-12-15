package FindMaxAndMinValuesExercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxAndMinValuesTest {

    private FindMaxAndMinValues findMaxAndMinValues = new FindMaxAndMinValues();

    @Test
    public void tests() {
        assertEquals(-110, findMaxAndMinValues.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, findMaxAndMinValues.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, findMaxAndMinValues.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, findMaxAndMinValues.max(new int[]{5}));
    }
}
