package com.exercises.maxchars;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"
public class MaxChars {

    public Character maxCharacters(String str) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        //Create a character array and return the values.
        char charArray[] = str.toCharArray();
        for (char c : charArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        //Iterator for Hashmap
        Iterator it = charMap.entrySet().iterator();

        Character maxKey = null;
        int maxValue = 0;

        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            if ((Integer) pair.getValue() > maxValue) {
                maxKey = (char) pair.getKey();
                maxValue = (Integer) pair.getValue();
            }
            it.remove();
        }
        
    return maxKey;

    }

}
