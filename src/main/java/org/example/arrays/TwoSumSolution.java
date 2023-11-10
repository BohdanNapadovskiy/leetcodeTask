package org.example.arrays;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int currentElem = nums[i];
            int nexIndex = i + 1;
            for (; nexIndex < nums.length; nexIndex++) {
                int nextValue = nums[nexIndex];
                if ((currentElem + nextValue) == target) {
                    result[0] = i;
                    result[1] = nexIndex;
                    return result;
                }
            }
        }
        return result;

    }
}
