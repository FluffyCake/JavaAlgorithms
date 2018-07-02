package com.exercises.chunk;

import java.util.ArrayList;

// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
public class Chunk {

//    int[][] arrayChunking(Integer[] array, int size) {
//
//        //initialize the return chunked array first.
//
//        //Java arrays have a set size so the size must be determined first.
//        //Remember to convert to double for ceil then convert it back to int for typing.
//        int numOfChunks = (int) Math.ceil((double) array.length / size);
//        int[][] chunked = new int [numOfChunks][];
//
//        for(int i = 0; i < numOfChunks; ++i) {
//            int start = i * size;
//            int length = Math.min(array.length - start, size);
//
//            int[] temp = new int[length];
//            System.arraycopy(array, start, temp, 0, length);
//            chunked[i] = temp;
//        }
//
//        return chunked;
//
//    }

    int[][] arrayChunking(int[] array, int size) {

        ArrayList<ArrayList<Integer>> chunked = new ArrayList<>();

        System.out.println(chunked.size());

        for(int i = 0; i < array.length; i++) {

            ArrayList<Integer> lastChunk = new ArrayList<>();
            if (chunked.size() != 0) {
                lastChunk = chunked.get(chunked.size() - 1);
            }

            if (lastChunk == null || lastChunk.size() == size) {
                ArrayList<Integer> newChunk = new ArrayList<>();
                newChunk.add(array[i]);
                chunked.add(newChunk);
            } else {
                lastChunk.add(array[i]);
            }

        }

        //lambda conversion of arraylist to double array.
        int[][] chunkedArray = chunked.stream().map(u -> u.toArray(new Integer[0])).toArray(int[][]::new);
        return chunkedArray;
    }

}
