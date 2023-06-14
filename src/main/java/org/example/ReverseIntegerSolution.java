package org.example;

import java.util.Arrays;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        char[] array = Integer.toString(x).toCharArray();
        char[] resultArray = new char[array.length];
        int length = array.length - 1;
        int i = 0;
        while (length >= 0) {
            if(array[length] != '-' || ((length == array.length - 1) && (array[length] != '0'))) {
                resultArray[i] = array[length];
            }

            i++;
            length--;
        }
        if (resultArray[0] == '0') {
            resultArray[0] = ' ';
        }
        String str = new String(resultArray).trim();
        return Math.abs(Integer.parseInt(str));

    }
}
