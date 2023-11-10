package org.example.arrays;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxInd = Math.min(i + 1, nums.length - 1);
            if (target == nums[i]) return i;
            else if(target > nums[nums.length-1]) return nums.length;
            else {
                if (target > nums[i] && target < nums[maxInd])
                    return maxInd;
            }

        }
        return result;

    }
}
