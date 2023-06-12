package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    @Test
    void whenInputArrayOfNumsThenReturnTwoSum() {
        int[] inputArray = new int[]{2, 7, 11, 15};
        int[] expectedResult = new int[] {0,1};
        int target = 9;
        TwoSumSolution solution = new TwoSumSolution();
        int[] result = solution.twoSum(inputArray, target);
        assertArrayEquals(expectedResult, result);

    }
}