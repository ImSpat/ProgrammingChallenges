package FizzBuzzExcercise;

public class FizzBuzz {
    public static void runFizzBuzz(StringBuilder output) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.append(i).append(" - ").append("FizzBuzz\n");
            }
            else if (i % 5 == 0) {
                output.append(i).append(" - ").append("Buzz\n");
            }
            else if (i % 3 == 0) {
                output.append(i).append(" - ").append("Fizz\n");
            }
            else {
                output.append(i).append(" - \n");
            }
        }

    }
}
