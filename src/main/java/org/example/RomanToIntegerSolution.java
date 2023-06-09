package org.example;

import java.util.HashMap;

public class RomanToIntegerSolution {
    public int romanToInt(String s) {
        HashMap<String, Integer> converterMap = new HashMap<>();
        converterMap.put("I", 1);
        converterMap.put("V", 5);
        converterMap.put("X", 10);
        converterMap.put("L", 50);
        converterMap.put("C", 100);
        converterMap.put("D", 500);
        converterMap.put("M", 1000);
        char[] letters = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < letters.length;) {
            int nextInd = i + 1;
            int maxInd = Math.min(nextInd, letters.length-1);
            int currentValue = converterMap.get(String.valueOf(letters[i]));
            int nextValue = converterMap.get(String.valueOf(letters[maxInd]));
            if (nextValue > currentValue) {
                sum = sum + (nextValue - currentValue);
                i = maxInd+1;
            } else {
                sum = sum + converterMap.get(String.valueOf(letters[i]));
                i++;
            }

        }
        return sum;
    }


}
