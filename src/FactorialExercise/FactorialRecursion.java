package FactorialExercise;

public class FactorialRecursion {
    public static long calculateFactorial(int n) {
        return n < 2 ? 1 : n * calculateFactorial(n - 1);
    }
}
