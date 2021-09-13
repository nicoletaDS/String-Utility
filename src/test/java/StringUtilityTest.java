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

}