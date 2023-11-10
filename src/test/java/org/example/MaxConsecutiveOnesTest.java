package org.example;

import org.example.arrays.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesTest {

    @Test
    void longestOnes() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        assertEquals(solution.longestOnes(nums, k), 6);
    }


}