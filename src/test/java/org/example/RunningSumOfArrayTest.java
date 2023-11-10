package org.example;

import org.example.arrays.RunningSumOfArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOfArrayTest {

    @Test
    void runningSum() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] result = {3, 4, 6, 16, 17};
        RunningSumOfArray solution = new RunningSumOfArray();
        assertArrayEquals(solution.runningSum(nums), result);
    }
}