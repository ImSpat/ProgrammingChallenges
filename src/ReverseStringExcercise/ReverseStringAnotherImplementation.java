package ReverseStringExcercise;

import java.util.Locale;

public class ReverseStringAnotherImplementation {

    public static String reverseString(String word) {
        word = word.toLowerCase(Locale.ROOT);
        char[] wordCharArray = word.toCharArray();
        int i = 0;
        int j = wordCharArray.length-1;
        while (i<j) {
            char temp = wordCharArray[i];
            wordCharArray[i] = wordCharArray[j];
            wordCharArray[j] = temp;
            i++;
            j--;
        }
        return new String(wordCharArray);
    }

}
