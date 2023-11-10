package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixDiagonalSumTest {

    @Test
    void diagonalSum() {
        MatrixDiagonalSum sum = new MatrixDiagonalSum();
        int input[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        assertEquals(25, sum.diagonalSum(input));

    }

    @Test
    void diagonalSum1() {
        MatrixDiagonalSum sum = new MatrixDiagonalSum();
        int input[][] = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        assertEquals(8, sum.diagonalSum(input));

    }

}