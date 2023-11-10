package org.example.arrays;

import java.util.Arrays;

public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        char[] digits = Integer.toString(x).toCharArray();
        char[] reverseDigits = new char[digits.length];
        int ind = digits.length - 1;
        for (char digit : digits) {
            reverseDigits[ind] = digit;
            ind--;
        }
        return Arrays.equals(digits, reverseDigits);
    }
}
