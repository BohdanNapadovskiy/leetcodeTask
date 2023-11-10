package org.example;

import org.example.arrays.ReverseOnlyLetters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseOnlyLettersTest {

    @Test
    void reverseOnlyLetters() {
        String input = "7_28]";
        String result = "7_28]";
        ReverseOnlyLetters solution = new ReverseOnlyLetters();
        assertEquals(result, solution.reverseOnlyLetters(input));

    }
}