package com.exercises.chunk;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChunkTest {

    @Test
    public void arrayChunking() {

        Chunk chunk = new Chunk();

        int array[] = {1,2,3};
        System.out.println(chunk.arrayChunking(array, 3));



    }
}