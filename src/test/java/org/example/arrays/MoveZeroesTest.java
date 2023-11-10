package org.example.arrays;

import org.junit.jupiter.api.Test;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] array = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(array);
    }
}