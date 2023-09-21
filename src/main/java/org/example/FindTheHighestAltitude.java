package org.example;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] resultArray = new int[gain.length + 1];
        int max = 0;
        resultArray[0] = max;
        for (int i = 1; i < resultArray.length; i++) {
            resultArray[i] = resultArray[i - 1] + gain[i - 1];
            if (resultArray[i] > max) max = resultArray[i];
        }
        return max;
    }

}
