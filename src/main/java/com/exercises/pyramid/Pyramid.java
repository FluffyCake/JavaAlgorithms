package com.exercises.pyramid;

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'
public class Pyramid {

    public void createPyramid(int n) {

        String block = "";

        for(int row = 0; row < n; row++){
            for (int col = 0; col < (2*n-1); col++) {
                if (col >= n - 1 - row && col <= n - 1 + row) {
                    block = block.concat("#");
                } else {
                    block = block.concat(" ");
                }
            }
            System.out.println(block);
            block = "";
        }
    }

}