package org.example;

import org.example.arrays.PalindromeNumberSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberSolutionTest {

    @Test
    void whenInputIntegerIsPalindromeThenReturnTrue() {
        int input = 121;
        PalindromeNumberSolution solution = new PalindromeNumberSolution();
        assertTrue(solution.isPalindrome(input));
    }


    @Test
    void whenInputIntegerIsNotPalindromeThenReturnFalse() {
        int input = -121;
        PalindromeNumberSolution solution = new PalindromeNumberSolution();
        assertFalse(solution.isPalindrome(input));
    }

}