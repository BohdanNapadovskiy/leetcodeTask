package org.example;

import org.example.arrays.ReversePrefixOfWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {

    @Test
    void reversePrefix() {
        String input = "abcdefd";
        char ch = 'd';
        String result = "dcbaefd";
        ReversePrefixOfWord solution = new ReversePrefixOfWord();
        assertEquals(solution.reversePrefix(input, ch), result);
    }
}