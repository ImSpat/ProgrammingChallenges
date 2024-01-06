package AnagramsExcercise;

// Write Java program to check if two strings are anagram.
// Two strings are said to be anagram if we can form one string by arranging the characters of another string.
// Example: Race and Care.

import java.util.Arrays;
import java.util.Locale;

public class Anagrams {

    public static boolean checkIfAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        word1 = word1.toLowerCase(Locale.ROOT);
        word2 = word2.toLowerCase(Locale.ROOT);

        char[] word1CharArray = word1.toCharArray();
        char[] word2CharArray = word2.toCharArray();

        Arrays.sort(word1CharArray);
        Arrays.sort(word2CharArray);

        return Arrays.equals(word1CharArray, word2CharArray);
    }
}
