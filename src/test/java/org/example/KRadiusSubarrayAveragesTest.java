package org.example;

import org.example.arrays.KRadiusSubarrayAverages;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KRadiusSubarrayAveragesTest {

    @Test
    void getAverages() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 100000);
        int k = 40000;
        int[] result = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        KRadiusSubarrayAverages solution = new KRadiusSubarrayAverages();
        assertArrayEquals(solution.getAverages(nums, k), result);
    }

    @Test
    void getAveragesForOneElement() {
        int[] nums = {100000};
        int k = 0;
        int[] result = {100000};
        KRadiusSubarrayAverages solution = new KRadiusSubarrayAverages();
        assertArrayEquals(solution.getAverages(nums, k), result);
    }

}