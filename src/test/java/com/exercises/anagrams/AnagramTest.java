package com.exercises.anagrams;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void checkAnagram() {

        Anagram anagram = new Anagram();

        assertTrue(anagram.checkAnagram("hello", "llohe"));
        assertTrue(anagram.checkAnagram("Whoa! Hi!", "Hi! Whoa!"));
        assertFalse(anagram.checkAnagram("One One", "Two two two"));
        assertFalse(anagram.checkAnagram("One one", "One one c"));
        assertFalse(anagram.checkAnagram("A tree, a life, a bench", "A tree, a fence, a yard"));

    }
}