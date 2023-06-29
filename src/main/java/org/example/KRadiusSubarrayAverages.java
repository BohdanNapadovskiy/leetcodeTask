package org.example;

public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        long[] averageArray = new long[nums.length];
        int[] result = new int[nums.length];
        averageArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            averageArray[i] = nums[i] + averageArray[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            long average;
            int left = (i - k);
            int right = (i + k);
            int length = (2 * k) + 1;
            result[i] = -1;
            if (left >= 0 && right < nums.length) {
                if (left > 0) average = (averageArray[right] - averageArray[left - 1]) / length;
                else average = averageArray[right] / length;
                result[i] = (int) average;
            }
        }
        return result;
    }
}
