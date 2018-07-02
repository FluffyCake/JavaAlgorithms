package com.exercises.step;

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'
public class Step {

    public void printSteps(int n) {

        String step = "#";
        String space = " ";

        String stair = "";
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row >= col) {
                    stair = stair.concat(step);
                } else {
                    stair = stair.concat(space);
                }
            }
            System.out.println(stair);
            stair = "";
        }

    }



}
