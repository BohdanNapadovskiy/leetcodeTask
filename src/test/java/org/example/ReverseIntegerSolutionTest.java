package org.example;

import org.example.arrays.ReverseIntegerSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerSolutionTest {

    @Test
    void whenInputIntegerIsPositiveThenReturnReverseResult() {
        int input = 123;
        ReverseIntegerSolution solution = new ReverseIntegerSolution();
        assertEquals(321,solution.reverse(input));
    }

    @Test
    void whenInputIntegerIsNegativeThenReturnReverseResult() {
        int input = -123;
        ReverseIntegerSolution solution = new ReverseIntegerSolution();
        assertEquals(-321,solution.reverse(input));
    }


    @Test
    void whenInputIntegerFinishOnZeroThenReturnReverseResult() {
        int input = 120;
        ReverseIntegerSolution solution = new ReverseIntegerSolution();
        assertEquals(21,solution.reverse(input));
    }


    @Test
    void whenInputIntegerFinishOnZerosThenReturnReverseResult() {
        int input = 1534236469;
        ReverseIntegerSolution solution = new ReverseIntegerSolution();
        assertEquals(0,solution.reverse(input));
    }



}