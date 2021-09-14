import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {

    @Test
    void reverse() {
        assertEquals("cba", StringUtility.reverse("abc"));
        assertEquals("_ cba", StringUtility.reverse("abc _"));
    }

    @Test
    void checkPalindrome() {
        assertTrue(StringUtility.checkPalindrome("abba"));
        assertTrue(StringUtility.checkPalindrome("1maM1"));
        assertFalse(StringUtility.checkPalindrome("abl 3"));
    }

    @Test
    void checkRemoveCharacter() {
        assertEquals("abc", StringUtility.removeCharacter("ab3c", 2));
        assertEquals("ab", StringUtility.removeCharacter("ab", 3));
    }

    @Test
    void checkIsAnagram() {
        assertTrue(StringUtility.isAnagram("abcd", "dacb"));
        assertTrue(StringUtility.isAnagram("a2cg", "2gca"));
        assertFalse(StringUtility.isAnagram("adda", "da"));
    }

    @Test
    void checkCapitalize() {
        assertEquals("1abcd", StringUtility.capitalize("1abcd"));
        assertEquals("Abcd", StringUtility.capitalize("Abcd"));
    }

    @Test
    void countCharacter() {
        assertEquals(2, StringUtility.countCharacter("addab", 'a'));
        assertEquals(0, StringUtility.countCharacter("abcd", 'x'));
    }

}