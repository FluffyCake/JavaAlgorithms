package com.exercises.reversestring;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void solution1() {
        ReverseString reverseString = new ReverseString();
        assertTrue(reverseString.reverseString("abcd").equals("dcba"));

        assertTrue(reverseString.reverseString("  abcd").equals("dcba  "));

    }
}