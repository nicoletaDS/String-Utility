
/**
 * This class contains some String useful methods.
 */

public class StringUtility {

    /**
     * Constructs a new instance of {@link StringUtility}.
     * May not be called because {@link StringUtility} is a utility class.
     */
    private StringUtility() {
        throw new UnsupportedOperationException("Utility class may not be instantiated.");
    }

    /**
     * A method that takes a String as parameter and returns a new String,
     * in reverse order.
     *
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
     * Check if a given word is a palindrome.
     *
     * A palindrome is a sequence of characters which reads the same
     * backward as forward.
     *
     * @param word the word to be checked.
     * @return true if the word is a palindrome, false otherwise.
     */
    public static boolean checkPalindrome(String word) {
        return word.toLowerCase().equals(reverse(word.toLowerCase()));
    }

    /**
     * Remove the character at the specified position.
     *
     * @param word the string from where the chgitaracter should be removed
     * @param index the character position
     * @return a new String that does not contain the character at position index
     */
    public static String removeCharacter(String word, int index) {
        String newString = "";
        for(int i=word.length()-1; i>=0; i--) {
            if(index != i)
                newString = newString.concat(String.valueOf(word.charAt(i)));
        }
        return newString;
    }


}
