package org.example;

import org.example.arrays.ValidParenthesesSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ValidParenthesesSolutionTest {

    @Test
    void whenInputIsValidThenReturnTrue() {
        String inputString = "()";
        ValidParenthesesSolution test = new ValidParenthesesSolution();
        assertTrue(test.isValid(inputString));
    }

    @Test
    void whenInputIsValidThenReturnFalse() {
        String inputString = "(]";
        ValidParenthesesSolution test = new ValidParenthesesSolution();
        assertFalse(test.isValid(inputString));
    }


}