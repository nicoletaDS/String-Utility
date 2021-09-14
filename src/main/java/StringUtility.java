
/**
 * This class contains some String useful methods.
 */

public final class StringUtility {

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
        // if the index is greater than the length of the word,
        // nothing will be removed
        if (index >= word.length()) return word;

        String newString = "";
        for(int i=word.length()-1; i>=0; i--) {
            if(index != i)
                newString = newString.concat(String.valueOf(word.charAt(i)));
        }
        return newString;
    }

    /**
     * Check if one word an anagram from the other is.
     *
     * A word is an anagram from another one if it contains only characters from
     * the second, but in a different order.
     *
     * @param word1 the word to be checked
     * @param word2 the reference word
     */
    public static boolean isAnagram(String word1, String word2) {
        // if the length of the words are different, this can not be anagrams
        if (word1.length() != word2.length()) return false;

        // check if every letter from word1 is contained in word2
        // if it is, remove if from word2(letters) to not be checked again
        // (in case one letter appears more than once in word1)
        String letters = word2;
        for (int i = 0; i < word1.length(); i++) {
            if (letters.indexOf(word1.charAt(i)) != -1)
                return false;
            else
                letters = StringUtility.removeCharacter(letters, i);
        }
        return true;
    }

    /**
     * @return a new string, with the first character capitalized
     */
    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    /**
     * @param word a string where there character should be searched for
     * @param character the searched char in word
     * @return the number of appearances in word of the provided character
     */
    public static int countCharacter(String word, char character) {
        int appearances = 0;
        for (int i = 0; i < word.length(); i++) {
            if (character == word.charAt(i)) appearances++;
        }
        return appearances;
    }
}
