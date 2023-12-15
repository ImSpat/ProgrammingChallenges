package RemoveVowelsExercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveVowelsTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",RemoveVowels.disemvowel("This website is for losers LOL!"));
    }
}
