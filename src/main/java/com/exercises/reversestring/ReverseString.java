package com.exercises.reversestring;

public class ReverseString {

    public String reverseString(String str) {
        StringBuilder input = new StringBuilder(str);
        return input.reverse().toString();
    }

}
