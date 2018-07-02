package com.exercises.capitalize;

import java.util.Iterator;

public class Capitalize {

    public String capitalize(String str) {

        String[] stringArray = str.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            String temp = stringArray[i];
            String capital = temp.substring(0,1);
            String lower = temp.substring(1);

            capital = capital.toUpperCase();
            temp = capital.concat(lower);

            stringArray[i] = temp;
        }

        return String.join(" ", stringArray);

    }

}
