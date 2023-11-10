package org.example.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingElementsTest {

    @Test
    void countElementsTest1() {
        CountingElements elements = new CountingElements();
        int[] nums = {1, 2, 3};
        int result = elements.countElements(nums);
        assertEquals(2, result);
    }

    @Test
    void countElementsTest2() {
        CountingElements elements = new CountingElements();
        int[] nums = {1, 1, 3, 3, 5, 5, 7, 7};
        int result = elements.countElements(nums);
        assertEquals(0, result);
    }

}