package org.example.arrays;

public class SelectionSort {

    private int[] array;


    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < array.length - 1; out++) {
            min = out;
            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[min])
                    min = in;
                swap(out, min);
            }
        }
    }

    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }


    private void fillArray(int[] array) {


    }

}
