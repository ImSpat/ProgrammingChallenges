package ReverseStringExcercise;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void test() {
        Assert.assertEquals("dog", ReverseString.reverseString("god"));
        Assert.assertEquals("abc", ReverseString.reverseString("cba"));
    }
}
