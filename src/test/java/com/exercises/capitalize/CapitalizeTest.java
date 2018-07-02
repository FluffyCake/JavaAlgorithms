package com.exercises.capitalize;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizeTest {

    @Test
    public void capitalize() {
        Capitalize capitalize = new Capitalize();

        assertEquals("Hi There, How Is It Going?", capitalize.capitalize("hi there, how is it going?"));
        assertEquals("I Love Breakfast At Bill Miller Bbq", capitalize.capitalize("i love breakfast at bill miller bbq"));

    }
}