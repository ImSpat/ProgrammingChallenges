package FibonacciSequenceExercise;

public class FibonacciSequenceRecursion {

    public static int calculateNthElementOfFibonacciSeries(int n) {
        return n < 2 ? n : calculateNthElementOfFibonacciSeries(n - 1) + calculateNthElementOfFibonacciSeries(n - 2);
    }
}
