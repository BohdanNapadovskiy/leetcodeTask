package org.example;

import org.example.arrays.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {

        int[] input = {-3,-1,0,0,0,3,3};
        RemoveDuplicates solution = new RemoveDuplicates();
        assertEquals(solution.removeDuplicates(input), 4);

    }
}