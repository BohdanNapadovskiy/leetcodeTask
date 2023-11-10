package org.example.hashing;

import java.util.HashSet;

public class PangramSentence {

    public boolean checkIfPangram(String sentence) {
        boolean result = false;
        HashSet<String> set = new HashSet<>();
        char[] arrayOfChar = sentence.toCharArray();

        for (int i = 0; i <= arrayOfChar.length - 1; i++) {
            set.add(String.valueOf(arrayOfChar[i]));
        }

        if (set.size() == 26) {
            result = true;
        }

        return result;
    }
}
