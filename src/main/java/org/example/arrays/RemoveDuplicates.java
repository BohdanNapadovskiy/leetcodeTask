package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> expectedNums = new ArrayList<>();
        int ind = 0;
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) expectedNums.add(nums[i]);
            else {
                if (nums[i] != expectedNums.get(ind)) {
                    expectedNums.add(nums[i]);
                    ind++;
                }
            }
        }
        Arrays.fill(nums, 0);
        for(int el:expectedNums) nums[j++] = el;
        return expectedNums.size();
    }

}
