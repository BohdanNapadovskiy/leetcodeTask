package org.example.arrays;

public class ReverseStringSolution {


    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;
        while(first <= last) {
            char firstSymbol = s[first];
            char lastSymbol = s[last];
            s[first] = lastSymbol;
            s[last] = firstSymbol;
            first++;
            last--;
        }
        int a=1;
    }


}
