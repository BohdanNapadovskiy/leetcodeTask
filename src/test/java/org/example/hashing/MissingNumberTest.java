package org.example.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @Test
    void missingNumberTest1() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0, 1};
        int result = missingNumber.missingNumber(nums);
        assertEquals(2, result);

    }

    @Test
    void missingNumberTest2() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3, 0, 1};
        int result = missingNumber.missingNumber(nums);
        assertEquals(2, result);
    }

    @Test
    void missingNumberTest3() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = missingNumber.missingNumber(nums);
        assertEquals(8, result);
    }

    @Test
    void missingNumberTest4() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0, 2};
        int result = missingNumber.missingNumber(nums);
        assertEquals(1, result);
    }


}