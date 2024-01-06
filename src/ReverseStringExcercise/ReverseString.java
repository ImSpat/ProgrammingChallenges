package ReverseStringExcercise;

public class ReverseString {
    public static String reverseString(String word) {
        StringBuilder wordBackwards = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            wordBackwards.append(word.charAt(i));
        }
        return wordBackwards.toString();
    }
}
