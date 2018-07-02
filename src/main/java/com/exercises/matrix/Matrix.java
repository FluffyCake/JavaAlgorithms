package com.exercises.matrix;


// --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral com.exercises.matrix.
// --- Examples
//   com.exercises.matrix(2)
//     [[1, 2],
//     [4, 3]]
//   com.exercises.matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  com.exercises.matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]
public class Matrix {

    public int[][] spiralMatrix(int n) {

        int[][] resultSet = new int[n][n];
        int counter = 1;

        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        while(startCol <= endCol && startRow <= endRow) {

            //You have 4 different looping actions.
            for (int i = startCol; i <= endCol; i++) {
                resultSet[startRow][i] = counter;
                counter++;
            }
            //Increment start row
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                resultSet[i][endCol] = counter;
                counter++;
            }
            //Decrement end column
            endCol--;
            for (int i = endCol; i >= startCol; i--) {
                resultSet[endRow][i] = counter;
                counter++;
            }
            //Decrement end Row
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                resultSet[i][startCol] = counter;
                counter++;
            }
            //Increment start column
            startCol++;

        }

        return resultSet;
    }

}
