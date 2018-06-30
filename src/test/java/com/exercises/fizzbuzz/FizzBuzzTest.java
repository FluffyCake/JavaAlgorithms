package com.exercises.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void fizzBuzz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(15);

        String[] message = outContent.toString().split("\r\n");

        System.setOut(originalOut);
        System.setErr(originalErr);

        int i = 1;
        for (String str : message) {
            if (i % 15 == 0) {
                System.out.println("Expected output | Actual: fizzbuzz | " + str);
                assertEquals("fizzbuzz", str);
            } else if(i % 3 == 0) {
                System.out.println("Expected output | Actual: fizz | " + str);
                assertEquals("fizz", str);
            } else if(i % 5 == 0) {
                System.out.println("Expected output | Actual: buzz | " + str);
                assertEquals("buzz", str);
            } else {
                System.out.println("Expected output | Actual: " + i + " | " + str);
                assertEquals(Integer.toString(i), str);
            }
            i++;
        }


    }
}