package org.example.hashing;

import java.util.HashSet;

public class CountingElements {

    public int countElements(int[] arr) {
        int result = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr)
            set.add(j);

        for (int i : arr) {
            if (set.contains(i + 1)) {
                result++;
            }
        }
        return result;

    }
}
