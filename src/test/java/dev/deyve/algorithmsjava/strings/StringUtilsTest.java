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

        Map<Character, Integer> expectedResult = Map.of('a', 2, 'b', 2, 'c', 1);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Counting Duplicate Characters with Stream; return Map with character and number of occurrences")
    public void countingDuplicateCharactersStreamTest() {

        String mockString = "aabbc";

        Map<Character, Long> result = stringUtils.countDuplicateCharactersStream(mockString);

        Map<Character, Long> expectedResult = Map.of('a', 2L, 'b', 2L, 'c', 1L);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Finding the first non-repeated character; return character")
    public void firstNonRepeatedCharacterTest() {

        String mockString = "David";

        Character result = stringUtils.firstNonRepeatedCharacter(mockString);

        Character expectedResult = 'D';

        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("StringUtils; Finding the first non-repeated character using LinkedHashMap; return character")
    public void firstNonRepeatedCharacterLinkedHashMapTest() {

        String mockString = "David";

        Character result = stringUtils.firstNonRepeatedCharacterLinkedHashMap(mockString);

        Character expectedResult = 'D';

        assertEquals(result, expectedResult);
    }
}