package org.example;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSection = 0;
        for (int num : nums) totalSum = totalSum + num;
        for (int i = 0; i < nums.length; i++) {
            int rightSection = totalSum - leftSection - nums[i];
            if (rightSection == leftSection) {
                return i;
            }
            leftSection = leftSection + nums[i];
        }
        return -1;
    }
}
