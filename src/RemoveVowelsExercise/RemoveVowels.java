package RemoveVowelsExercise;

//  Your task is to write a function that takes a string and return a new string with all vowels removed.
//  Example:
//      "This website is for losers LOL!" --> "Ths wbst s fr lsrs LL!"
//  Note: for this kata y isn't considered a vowel.

public class RemoveVowels {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
