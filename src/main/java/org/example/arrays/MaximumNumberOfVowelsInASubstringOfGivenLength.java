package org.example.arrays;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            count = count + (vowels.contains(s.charAt(i)) ? 1 : 0);
        }
        int ans = count;
        for (int i = k; i < s.length(); i++) {
            count = count + (vowels.contains(s.charAt(i)) ? 1 : 0);
            count = count - (vowels.contains(s.charAt(i-k)) ? 1 : 0);
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
