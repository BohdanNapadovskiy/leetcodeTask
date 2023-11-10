package org.example;

import org.example.arrays.MaximumAverageSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayTest {

    @Test
    void findMaxAverage() {
        int[] nums = {5};
        int k = 1;
        MaximumAverageSubarray solution = new MaximumAverageSubarray();
        assertEquals(solution.findMaxAverage(nums, k), 5);
    }
}