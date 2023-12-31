package InvertValuesExercise;

import java.util.Arrays;

//  Given a set of numbers, return the additive inverse of each.
//  Each positive becomes negatives, and the negatives become positives.
//  Example:
//      invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//      invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//      invert([]) == []

public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(x -> x * (-1)).toArray();
    }
}
