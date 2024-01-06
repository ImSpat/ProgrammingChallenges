package AnagramsExcercise;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {

    @Test
    public void test() {
        assertTrue(Anagrams.checkIfAnagram("Race", "Care"));
        assertTrue(Anagrams.checkIfAnagram("God", "Dog"));
        assertFalse(Anagrams.checkIfAnagram("Race", "Stone"));
        assertFalse(Anagrams.checkIfAnagram("Race", "Good"));
    }
}
