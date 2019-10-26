package dev.deyve.algorithmsjava.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("StringUtils; Counting Duplicate Characters; return Map with character and number of occurrences")
    public void countingDuplicateCharactersTest() {

        String mockString = "aabbc";

        Map<Character, Integer> result = stringUtils.countingDuplicateCharacters(mockString);

        Map<Character, Integer> expetedResult = Map.of('a', 2, 'b', 2, 'c', 1);

        assertEquals(result, expetedResult);
    }

    @Test
    @DisplayName("StringUtils; Counting Duplicate Characters with Stream; return Map with character and number of occurrences")
    public void countingDuplicateCharactersStreamTest() {

        String mockString = "aabbc";

        Map<Character, Long> result = stringUtils.countDuplicateCharactersStream(mockString);

        Map<Character, Long> expetedResult = Map.of('a', 2L, 'b', 2L, 'c', 1L);

        assertEquals(result, expetedResult);
    }
}