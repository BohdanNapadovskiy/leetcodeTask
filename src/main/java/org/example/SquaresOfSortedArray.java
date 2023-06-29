package org.example;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] sqArray = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int ind = nums.length - 1;
        while (ind >= 0) {
            int currentValue = nums[left];
            if (Math.abs(currentValue) > Math.abs(nums[right])) {
                sqArray[ind] = currentValue * currentValue;
                left++;
            } else {
                sqArray[ind] = nums[right] * nums[right];
                right--;
            }
            ind--;
        }
        return sqArray;
    }
}
