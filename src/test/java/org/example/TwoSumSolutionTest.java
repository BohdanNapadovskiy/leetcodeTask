package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    @Test
    void whenInputArrayOfNumsThenReturnTwoSum() {
        int[] inputArray = new int[]{3,2,4};
        int[] expectedResult = new int[] {1,2};
        int target = 6;
        TwoSumSolution solution = new TwoSumSolution();
        int[] result = solution.twoSum(inputArray, target);
        assertArrayEquals(expectedResult, result);

    }
}