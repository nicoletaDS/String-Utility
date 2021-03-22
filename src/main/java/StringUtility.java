
/**
 * This class contains some String useful methods.
 */

public class StringUtility {

    private StringUtility() {}

    /**
     * A method that takes a String as parameter and returns the same String,
     * but in reverse order.
     * @param word a String to be reversed
     * @return the word in the reverse order.
     */
    public static String reverse(String word) {
        String reversedWord = "";
        for(int i=word.length()-1; i>=0; i--) {
            reversedWord = reversedWord.concat(String.valueOf(word.charAt(i)));
        }
        return reversedWord;
    }

    /**
     * A method that checks if a given word is a palindrome.
     * @param word the word to be checked.
     * @return true if the word is a palindrome, false otherwise.
     */
    public static boolean checkPalindrome(String word) {
        return word.toLowerCase().equals(reverse(word.toLowerCase()));
    }



}
