package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringTest {

    @Test
    void reverseWords() {
        String input = "God Ding";
        String result = "doG gniD";
        ReverseWordsInAString solution = new ReverseWordsInAString();
        assertEquals(result, solution.reverseWords(input));

    }
}