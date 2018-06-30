package com.exercises.reverseint;

// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9

public class ReverseInt {

    public Integer reverseInt(int value) {

        int sign = Integer.signum(value);
        String str = Integer.toString(Math.abs(value));
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverse = stringBuilder.reverse().toString();
        int reverseInt = Integer.parseInt(reverse);

        return sign * reverseInt;
    }

}
