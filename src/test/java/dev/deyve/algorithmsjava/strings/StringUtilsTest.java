package dev.deyve.algorithmsjava.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("StringUtils; Counting Duplicate Characters; return Map with character and number of occurrences")
    void countingDuplicateCharactersTest() {

        String mockString = "aabbc";

        Map<Character, Integer> result = stringUtils.countingDuplicateCharacters(mockString);

        Map<Character, Integer> expectedResult = Map.of('a', 2, 'b', 2, 'c', 1);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Counting Duplicate Characters with Stream; return Map with character and number of occurrences")
    void countingDuplicateCharactersStreamTest() {

        String mockString = "aabbc";

        Map<Character, Long> result = stringUtils.countDuplicateCharactersStream(mockString);

        Map<Character, Long> expectedResult = Map.of('a', 2L, 'b', 2L, 'c', 1L);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Finding the first non-repeated character; return character")
    void firstNonRepeatedCharacterTest() {

        String mockString = "David";

        Character result = stringUtils.firstNonRepeatedCharacter(mockString);

        Character expectedResult = 'D';

        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("StringUtils; Finding the first non-repeated character using LinkedHashMap; return character")
    void firstNonRepeatedCharacterLinkedHashMapTest() {

        String mockString = "David";

        Character result = stringUtils.firstNonRepeatedCharacterLinkedHashMap(mockString);

        Character expectedResult = 'D';

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Reversing letters and words; return reversed string")
    void reverseWordsTest() {

        String mockString = "Ragnar Lothbrok";

        String result = stringUtils.reverseWords(mockString);

        String expectedResult = "rangaR korbhtoL ";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Reversing letters and words functional style; return reversed string")
    void reverseWordsFunctionalStyleTest() {

        String mockString = "Ragnar Lothbrok";

        String result = stringUtils.reverseWordsFunctionalStyle(mockString);

        String expectedResult = "rangaR korbhtoL";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string contains only digits; return boolean")
    void checkingWhetherStringContainsOnlyDigitsTest() {

        String mockDigits = "2019";
        String mockDigitsWithChar = "2019a";

        boolean resultDigits = stringUtils.checkingWhetherStringContainsOnlyDigits(mockDigits);
        boolean resultDigitsWithChar = stringUtils.checkingWhetherStringContainsOnlyDigits(mockDigitsWithChar);

        assertTrue(resultDigits);
        assertFalse(resultDigitsWithChar);
    }

    @Test
    @DisplayName("StringUtils; Counting vowels and consonants; return Map of String and Integer")
    void countVowelsAndConsonantsTest() {

        String mockString = "Vieira";

        Map<String, Integer> result = stringUtils.countVowelsAndConsonants(mockString);

        Map<String, Integer> expectedResult = Map.of("vowels", 4, "consonants", 2);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Counting vowels and consonants functional style; return Map of String and Long")
    void countVowelsAndConsonantsFunctionalStyleTest() {

        String mockString = "Vieira";

        Map<String, Long> result = stringUtils.countVowelsAndConsonantsFunctionalStyle(mockString);

        Map<String, Long> expectedResult = Map.of("vowels", 4L, "consonants", 2L);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Counting the occurrences of a certain character - Unicode surrogate")
    void countingOccurrencesOfCharacterTest() {

        String mockString = "occurrences";
        String mockCharacter = "c";

        long result = stringUtils.countingOccurrencesOfCharacter(mockString, mockCharacter);

        long expectedResult = 3;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Counting the occurrences of a certain character functional style")
    void countingOccurrencesOfCharacterFunctionalStyleTest() {

        String mockString = "occurrences";
        char mockCharacter = 'c';

        long result = stringUtils.countingOccurrencesOfCharacterFunctionalStyle(mockString, mockCharacter);

        long expectedResult = 3;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string is a palindrome")
    void checkingWhetherStringIsPalindromeTest() {

        String mockString = "madam";

        boolean result = stringUtils.isPalindrome(mockString);

        assertTrue(result);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string is not a palindrome")
    void checkingWhetherStringIsNotPalindromeTest() {

        String mockString = "madame";

        boolean result = stringUtils.isPalindrome(mockString);

        assertFalse(result);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string is a palindrome with StringBuilder")
    void checkingWhetherStringIsPalindromeWithStringBuilderTest() {

        String mockString = "madam";

        boolean result = stringUtils.isPalindromeWithStringBuilder(mockString);

        assertTrue(result);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string is not a palindrome with StringBuilder")
    void checkingWhetherStringIsNotPalindromeWithStringBuilderTest() {

        String mockString = "madame";

        boolean result = stringUtils.isPalindromeWithStringBuilder(mockString);

        assertFalse(result);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string is a palindrome functional style")
    void checkingWhetherStringIsPalindromeFunctionalStyleTest() {

        String mockString = "madam";

        boolean result = stringUtils.isPalindromeFunctionalStyle(mockString);

        assertTrue(result);
    }

    @Test
    @DisplayName("StringUtils; Checking whether a string is not a palindrome functional style")
    void checkingWhetherStringIsNotPalindromeFunctionalStyleTest() {

        String mockString = "madame";

        boolean result = stringUtils.isPalindromeFunctionalStyle(mockString);

        assertFalse(result);
    }

    @Test
    @DisplayName("StringUtils; Removing duplicate characters")
    void removeDuplicatesTest() {

        String mockString = "abracadabra";

        String result = stringUtils.removeDuplicates(mockString);

        String expectedResult = "abrcd";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Removing duplicate characters - Functional Style")
    void removeDuplicatesFunctionalStyleTest() {

        String mockString = "abracadabra";

        String result = stringUtils.removeDuplicatesFunctionalStyle(mockString);

        String expectedResult = "abrcd";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Removing a given character")
    void removeCharacterTest() {

        String mockString = "abracadabra";

        String result = stringUtils.removeCharacter(mockString, 'a');

        String expectedResult = "brcdbr";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Removing a given character - Functional Style")
    void removeCharacterTestFunctionalStyleTest() {

        String mockString = "abracadabra";

        String result = stringUtils.removeCharacterFunctionalStyle(mockString, 'a');

        String expectedResult = "brcdbr";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("StringUtils; Finding the character with the most appearances (Functional Style)")
    void maxOccurenceCharacterTest() {

        String mockString = "abracadabra";

        Map<Character, Long> result = stringUtils.maxOccurenceCharacter(mockString);

        Map<Character, Long> expectedResult = Map.of('a', 5L);

        assertEquals(result, expectedResult);
    }
}