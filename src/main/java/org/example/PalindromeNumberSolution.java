package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
