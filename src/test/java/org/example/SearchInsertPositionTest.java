package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        int[] nums = {1,3,5,6};
        SearchInsertPosition solution = new SearchInsertPosition();
        assertEquals(solution.searchInsert(nums,2), 1);


    }
}