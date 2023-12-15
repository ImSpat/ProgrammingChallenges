package BreakCamelCaseExercise;

//  Complete the solution so that the function will break up camel casing, using a space between words.
//
//  Example:
//      "camelCasing"  =>  "camel Casing"
//      "identifier"   =>  "identifier"
//      ""             =>  ""

public class BreakCamelCase {

    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(" ").append(input.charAt(i));
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}

// First solution

//public static String camelCase(String input) {
//    if (input.length() == 0) {
//        return "";
//    }
//
//    char[] charArray = input.toCharArray();
//    String result = "";
//    for (int i = 0; i < input.length() - 1; i++) {
//        result = result + charArray[i];
//        if (Character.isUpperCase(charArray[i + 1])) {
//            result = result + " ";
//        }
//    }
//    result = result + charArray[input.length() - 1];
//    return result;
//}
