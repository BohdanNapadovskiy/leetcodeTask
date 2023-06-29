package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    void minStartValue() {
        int[] nums = {-3, 2, -3, 4, 2};
        MinimumValueToGetPositiveStepByStepSum solution = new MinimumValueToGetPositiveStepByStepSum();
        assertEquals(solution.minStartValue(nums), 5);
    }
}