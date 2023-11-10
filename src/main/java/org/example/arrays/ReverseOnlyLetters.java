package org.example.arrays;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        char[] arrayOfChar = s.toCharArray();
        char[] result = new char[arrayOfChar.length];
        int left = 0;
        int right = arrayOfChar.length - 1;
        while (left <= right) {
            char leftElem = arrayOfChar[left];
            char rightElem = arrayOfChar[right];
            if (validateCharacter(leftElem) && !validateCharacter(rightElem)) {
                result[right] = arrayOfChar[right];
                right--;
                result[left] = arrayOfChar[right];
            } else if (!validateCharacter(leftElem) && validateCharacter(rightElem)) {
                result[left] = arrayOfChar[left];
                left++;
                result[right] = arrayOfChar[left];
            } else if (!validateCharacter(leftElem) && !validateCharacter(rightElem)) {
                result[left] = arrayOfChar[left];
                result[right] = arrayOfChar[right];
                left++;
                right--;
            } else {
                result[left] = arrayOfChar[right];
                result[right] = arrayOfChar[left];
                left++;
                right--;
            }

        }
        return new String(result);
    }

    private boolean validateCharacter(char character) {
        return ((int) character >= 65 && (int) character <= 90) ||
                ((int) character >= 97 && (int) character <= 122);
    }


}
