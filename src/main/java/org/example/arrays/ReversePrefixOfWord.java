package org.example.arrays;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        char[] arrayOfString = word.toCharArray();
        StringBuilder result = new StringBuilder();
        int right = 0;
        int left = 0;
        for (int i = 0; i < arrayOfString.length; i++) {
            if (arrayOfString[i] == ch) {
                right = i;
                break;
            }
        }
        while (left <= right) {
            char tempCh = arrayOfString[right];
            arrayOfString[right] = arrayOfString[left];
            arrayOfString[left] = tempCh;
            left++;
            right--;
        }
        return result.append(arrayOfString).toString();
    }

}
