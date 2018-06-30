package com.exercises.maxchars;

import com.exercises.maxchars.MaxChars;
import org.junit.Test;

public class MaxCharsTest {

    @Test
    public void maxCharacters() {

        MaxChars maxChars = new MaxChars();

        char value = maxChars.maxCharacters("abcdefghijklmnaaaaa");
        assert(value == 'a');
        System.out.println("value = " + value);
        value = maxChars.maxCharacters("ab1c1d1e1f1g1");
        assert(value == '1');
        System.out.println("value = " + value);

    }
}