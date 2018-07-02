package com.exercises.anagrams;

import java.util.HashMap;
import java.util.Iterator;

// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False
public class Anagram {

    public boolean checkAnagram(String strA, String strB) {

        strA = strA.replaceAll("[^a-zA-Z]", "").toLowerCase();
        strB = strB.replaceAll("[^a-zA-Z]", "").toLowerCase();

        HashMap<Character, Integer> mapA = generateCharMap(strA);
        HashMap<Character, Integer> mapB = generateCharMap(strB);

        if (mapA.size() != mapB.size()) {
            return false;
        }

        Iterator it = mapA.entrySet().iterator();

        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            //Get the key from charMapA and compare the values with charMapB.
            char c = (char) pair.getKey();
            if (mapA.get(c) != mapB.get(c))
                return false;
            it.remove();
        }

        return true;
    }


    private HashMap<Character, Integer> generateCharMap(String str) {

        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : charArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return charMap;
    }

}
