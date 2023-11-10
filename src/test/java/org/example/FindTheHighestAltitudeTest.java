package org.example;

import org.example.arrays.FindTheHighestAltitude;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheHighestAltitudeTest {

    @Test
    void largestAltitudeFirstTest() {
        int [] nums = {-5,1,5,0,-7};
        FindTheHighestAltitude solution = new FindTheHighestAltitude();
        assertEquals(solution.largestAltitude(nums), 1);

    }

    @Test
    void largestAltitudeSecondTest() {
        int [] nums = {-4,-3,-2,-1,4,3,2};
        FindTheHighestAltitude solution = new FindTheHighestAltitude();
        assertEquals(solution.largestAltitude(nums), 0);

    }

}