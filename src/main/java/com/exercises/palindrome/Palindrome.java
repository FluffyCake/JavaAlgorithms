package com.exercises.palindrome;

public class Palindrome {

    public boolean palindrome(String str) {
        StringBuilder input = new StringBuilder(str);
        return input.reverse().toString().equals(str);
    }


}
