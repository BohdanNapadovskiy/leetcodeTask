package org.example;

import java.util.Arrays;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        char[] array;
        int result;
        if(x < 0) array = Integer.toString(-1 * x).toCharArray();
        else array = Integer.toString(x).toCharArray();
        char[] resultArray = new char[array.length];
        int length = array.length - 1;
        int i = 0;
        while (length >= 0) {
            resultArray[i] = array[length];
            i++;
            length--;
        }
        String str = new String(resultArray).trim();
        int b = Integer.parseInt(str);
        if(x <0 ) result = -1 * b;
        else result = b;
        return result;

    }
}
