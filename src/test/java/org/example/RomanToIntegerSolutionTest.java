package org.example;

import org.example.arrays.RomanToIntegerSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerSolutionTest {

    @Test
    void whenInsertRomanNumberThenReturnInteger() {
        String inputString = "MCMXCIV";
        int output = 1994;
        RomanToIntegerSolution solution = new RomanToIntegerSolution();
        int result = solution.romanToInt(inputString);
        assertEquals(output, result);
    }
}