package org.example.arrays;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        int num = x;
        if (x < 0) num = -1 * x;
        char[] array = Integer.toString(num).toCharArray();
        char[] result = new char[array.length];
        StringBuilder str = new StringBuilder();
        int count = array.length - 1;
        int i = 0;
        while (count >= 0) {
            result[i] = array[count];
            count--;
            i++;
        }
        try {
            String resultStr = str.append(result).toString();
            int resultInt = Integer.parseInt(resultStr);
            if (x < 0) resultInt = -1 * resultInt;
            return resultInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
