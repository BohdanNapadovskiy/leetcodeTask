package org.example;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int left = 0;
            int right = word.length - 1;
            while (left <= right) {
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++;
                right--;
            }
            words[i] = new String(word);
            if (i == words.length - 1) {
                result.append(words[i]);
            } else {
                result.append(words[i]).append(" ");
            }
        }
        return result.toString();


    }
}
