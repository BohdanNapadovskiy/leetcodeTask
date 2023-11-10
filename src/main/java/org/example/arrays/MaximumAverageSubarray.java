package org.example.arrays;

public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        double summ = 0;
        for (int i = 0; i < k; i++) summ = summ + nums[i];
        double average = summ / k;
        for (int i = k; i < nums.length; i++) {
            summ = summ + (nums[i] - nums[i - k]);
            average = Math.max(average, (summ / k));
        }
        return average;
    }
}
