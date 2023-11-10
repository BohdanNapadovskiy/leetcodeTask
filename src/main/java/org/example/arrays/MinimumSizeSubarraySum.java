package org.example.arrays;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int right = 0;
        for (int left = 0; left < nums.length; left++) {
            sum = sum + nums[left];
            if (sum >= target) {
                while (sum >= target) {
                    min = Math.min(min, left - right + 1);
                    sum = sum - nums[right];
                    right++;
                }
            }
        }
        if (min == Integer.MAX_VALUE) return 0;
        else return min;
    }
}
