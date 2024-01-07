package ReverseStringExcercise;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void test() {
        Assert.assertEquals("dog", ReverseString.reverseString("god"));
        Assert.assertEquals("abc", ReverseString.reverseString("cba"));
        Assert.assertEquals("atok am alA", ReverseString.reverseString("Ala ma kota"));
    }

    @Test
    public void testAnotherImplementation() {
        Assert.assertEquals("dog", ReverseStringAnotherImplementation.reverseString("god"));
        Assert.assertEquals("abc", ReverseStringAnotherImplementation.reverseString("cba"));
        Assert.assertEquals("atok am ala", ReverseStringAnotherImplementation.reverseString("Ala ma kota"));
    }
}
