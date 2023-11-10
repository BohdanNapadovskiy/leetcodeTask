package org.example.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PangramSentenceTest {

    @Test
    void checkIfPangram() {
        PangramSentence pangramSentence = new PangramSentence();
        boolean result = pangramSentence.checkIfPangram("leetcode");
        assertEquals(result, false);
    }
}