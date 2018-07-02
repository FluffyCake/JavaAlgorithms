package com.exercises.pyramid;

import org.junit.Test;

import static org.junit.Assert.*;

public class PyramidTest {

    @Test
    public void createPyramid() {

        Pyramid pyramid = new Pyramid();

        pyramid.createPyramid(5);

    }
}