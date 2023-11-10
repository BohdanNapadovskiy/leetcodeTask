package org.example.arrays;

public class BinarySearch {

    public int binarySearch(int arraySize, int searchElement) {
        int[] array = new int[arraySize];
        int lowIndex = 0;
        int highIndex = array.length - 1;
        fillArray(array);
        while (true) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (array[midIndex] == searchElement) {
                return array[midIndex];
            } else if (lowIndex > highIndex) {
                return 0;
            } else {
                if (array[midIndex] < searchElement) {
                    lowIndex = midIndex + 1;
                } else {
                    highIndex = midIndex + 1;
                }
            }

        }


    }

    private void fillArray(int[] array) {


    }


}
