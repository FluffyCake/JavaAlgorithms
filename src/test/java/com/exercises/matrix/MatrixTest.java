package com.exercises.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void spiralMatrix() {

        Matrix matrix = new Matrix();

        int[][] two = {{1,2}, {4,3}};
        int[][] three = {{1,2,3}, {8,9,4}, {7,6,5}};
        int[][] four = {{1,2,3,4}, {12,13,14,5}, {11,16,15,6}, {10,9,8,7}};

        int[][] m = matrix.spiralMatrix(2);
        System.out.println("Checking 2x2 com.exercises.matrix");
        assertArrayEquals(two , m);
        m = matrix.spiralMatrix(3);
        System.out.println("Checking 3x3 com.exercises.matrix");
        assertArrayEquals(three , m);
        m = matrix.spiralMatrix(4);
        System.out.println("Checking 4x4 com.exercises.matrix");
        assertArrayEquals(four , m);

    }
}