package FizzBuzzExcercise;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test() {
        StringBuilder expectedOutput = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                expectedOutput.append(i).append(" - ").append("FizzBuzz\n");
            }
            else if (i % 5 == 0) {
                expectedOutput.append(i).append(" - ").append("Buzz\n");
            }
            else if (i % 3 == 0) {
                expectedOutput.append(i).append(" - ").append("Fizz\n");
            }
            else {
                expectedOutput.append(i).append(" - \n");
            }
        }

        StringBuilder actualOutput = new StringBuilder();
        FizzBuzz.runFizzBuzz(actualOutput);
        Assert.assertEquals(expectedOutput.toString(), actualOutput.toString());

    }

}
