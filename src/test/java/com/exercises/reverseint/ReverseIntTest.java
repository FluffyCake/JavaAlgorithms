package com.exercises.reverseint;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntTest {

    @Test
    public void reverseInt() {

        ReverseInt reverseInteger = new ReverseInt();

        System.out.println("Checking 0");
        assert(reverseInteger.reverseInt(0) == 0);

        System.out.println("Checking positive numbers");
        assert(reverseInteger.reverseInt(5) == 5);
        assert(reverseInteger.reverseInt(51) == 15);
        assert(reverseInteger.reverseInt(90) == 9);
        assert(reverseInteger.reverseInt(2359) == 9532);

        System.out.println("Checking negative numbers");
        assert(reverseInteger.reverseInt(-5) == -5);
        assert(reverseInteger.reverseInt(-51) == -15);
        assert(reverseInteger.reverseInt(-90) == -9);
        assert(reverseInteger.reverseInt(-2359) == -9532);

    }
}