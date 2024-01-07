package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("level"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("This is not a palindrome"));
    }
}

