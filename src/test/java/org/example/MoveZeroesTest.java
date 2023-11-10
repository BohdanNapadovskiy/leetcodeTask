package org.example;

import org.example.arrays.MoveZeroes;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] result = {1, 3, 12, 0, 0};
        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);


    }
}