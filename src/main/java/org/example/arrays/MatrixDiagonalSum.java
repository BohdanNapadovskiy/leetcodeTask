package org.example.arrays;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int result = 0;
        int firstIndex = 0;
        int lastIndex = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            if (firstIndex == lastIndex) {
                result = result + mat[i][firstIndex];
            } else {
                result = result + (mat[i][firstIndex] + mat[i][lastIndex]);
            }
            firstIndex++;
            lastIndex--;
        }
        return result;
    }
}
