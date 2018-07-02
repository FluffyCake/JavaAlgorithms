package com.exercises.step;

import org.junit.Test;

import static org.junit.Assert.*;

public class StepTest {

    @Test
    public void printSteps() {

        Step step = new Step();
        step.printSteps(25);

    }
}