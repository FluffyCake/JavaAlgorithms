package com.exercises.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void palindrome() {

        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.palindrome("aba"));
        assertFalse(palindrome.palindrome(" aba"));
        assertTrue(palindrome.palindrome("10000000001"));
        assertFalse(palindrome.palindrome("Fish hsif"));
        assertTrue(palindrome.palindrome("pennep"));

    }
}