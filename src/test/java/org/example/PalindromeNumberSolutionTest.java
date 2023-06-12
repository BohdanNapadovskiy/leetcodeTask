package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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