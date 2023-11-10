package org.example;

import org.example.arrays.MinimumSizeSubarraySum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {

    @Test
    void minSubArrayLen() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int k = 7;
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        assertEquals(solution.minSubArrayLen(k, nums), 2);
    }

    @Test
    void minSubArrayLenSecondTest() {
        int[] nums = {1, 4, 4};
        int target = 4;
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        assertEquals(1, solution.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenThirdTest() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        assertEquals(solution.minSubArrayLen(target, nums),0 );

    }

    @Test
    void minSubArrayLenLastTest() {
        int[] nums = {1,2,3,4,5};
        int target = 11;
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        assertEquals(solution.minSubArrayLen(target, nums), 3);

    }
}