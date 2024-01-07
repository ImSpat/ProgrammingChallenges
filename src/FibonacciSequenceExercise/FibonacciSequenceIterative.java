package FibonacciSequenceExercise;

public class FibonacciSequenceIterative {
    public static int calculateNthElementOfFibonacciSeries(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must be non-negative");
        }

        if (n < 2) {
            return n;
        }

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int temp = current;
            current = previous + current;
            previous = temp;
        }
        return current;
    }
}
