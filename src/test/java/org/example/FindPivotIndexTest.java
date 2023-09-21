package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    @Test
    void pivotIndexFirstTest() {
        int [] nums = {1,7,3,6,5,6};
        FindPivotIndex pivotIndex = new FindPivotIndex();
        assertEquals(pivotIndex.pivotIndex(nums), 3);
    }

    @Test
    void pivotIndexSecondTest() {
        int [] nums = {1,2,3};
        FindPivotIndex pivotIndex = new FindPivotIndex();
        assertEquals(pivotIndex.pivotIndex(nums), -1);
    }

    @Test
    void pivotIndexThirdTest() {
        int [] nums = {2,1,-1};
        FindPivotIndex pivotIndex = new FindPivotIndex();
        assertEquals(pivotIndex.pivotIndex(nums), 0);
    }


}