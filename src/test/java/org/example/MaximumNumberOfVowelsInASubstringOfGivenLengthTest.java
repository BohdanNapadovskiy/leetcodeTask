package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    @Test
    void minSubArrayLen() {
        String input = "abciiidef";
        int k = 3;
        MaximumNumberOfVowelsInASubstringOfGivenLength solution = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        assertEquals(solution.maxVowels(input, k), 3);
    }

    @Test
    void minSubArrayLenSecondTest() {
        String input = "aeiou";
        int k = 2;
        MaximumNumberOfVowelsInASubstringOfGivenLength solution = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        assertEquals(solution.maxVowels(input, k), 2);
    }

    @Test
    void minSubArrayLenThirdTest() {
        String input = "leetcode";
        int k = 3;
        MaximumNumberOfVowelsInASubstringOfGivenLength solution = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        assertEquals(solution.maxVowels(input, k), 2);
    }

    @Test
    void minSubArrayLenLastTest() {
        String input = "weallloveyou";
        int k = 7;
        MaximumNumberOfVowelsInASubstringOfGivenLength solution = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        assertEquals(solution.maxVowels(input, k), 4);
    }



}