package dev.deyve.algorithmsjava.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static dev.deyve.algorithmsjava.strings.StringUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * String Utils Tests
 */
class StringUtilsTest {

    @Test
    @DisplayName("Counting Duplicate Characters; return Map with character and number of occurrences")
    void countingDuplicateCharactersTest() {

        String mockString = "aabbc";

        Map<Character, Integer> result = countingDuplicateCharacters(mockString);

        Map<Character, Integer> expectedResult = Map.of('a', 2, 'b', 2, 'c', 1);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Counting Duplicate Characters with Stream; return Map with character and number of occurrences")
    void countingDuplicateCharactersStreamTest() {

        String mockString = "aabbc";

        Map<Character, Long> result = countDuplicateCharactersStream(mockString);

        Map<Character, Long> expectedResult = Map.of('a', 2L, 'b', 2L, 'c', 1L);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Finding the first non-repeated character; return character")
    void firstNonRepeatedCharacterTest() {

        String mockString = "David";

        Character result = firstNonRepeatedCharacter(mockString);

        Character expectedResult = 'D';

        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("Finding the first non-repeated character using LinkedHashMap; return character")
    void firstNonRepeatedCharacterLinkedHashMapTest() {

        String mockString = "David";

        Character result = firstNonRepeatedCharacterLinkedHashMap(mockString);

        Character expectedResult = 'D';

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Reversing letters and words; return reversed string")
    void reverseWordsTest() {

        String mockString = "Ragnar Lothbrok";

        String result = reverseWords(mockString);

        String expectedResult = "rangaR korbhtoL ";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Reversing letters and words functional style; return reversed string")
    void reverseWordsFunctionalStyleTest() {

        String mockString = "Ragnar Lothbrok";

        String result = reverseWordsFunctionalStyle(mockString);

        String expectedResult = "rangaR korbhtoL";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Checking whether a string contains only digits; return boolean")
    void checkingWhetherStringContainsOnlyDigitsTest() {

        String mockDigits = "2019";
        String mockDigitsWithChar = "2019a";

        boolean resultDigits = checkingWhetherStringContainsOnlyDigits(mockDigits);
        boolean resultDigitsWithChar = checkingWhetherStringContainsOnlyDigits(mockDigitsWithChar);

        assertTrue(resultDigits);
        assertFalse(resultDigitsWithChar);
    }

    @Test
    @DisplayName("Counting vowels and consonants; return Map of String and Integer")
    void countVowelsAndConsonantsTest() {

        String mockString = "Vieira";

        Map<String, Integer> result = countVowelsAndConsonants(mockString);

        Map<String, Integer> expectedResult = Map.of("vowels", 4, "consonants", 2);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Counting vowels and consonants functional style; return Map of String and Long")
    void countVowelsAndConsonantsFunctionalStyleTest() {

        String mockString = "Vieira";

        Map<String, Long> result = countVowelsAndConsonantsFunctionalStyle(mockString);

        Map<String, Long> expectedResult = Map.of("vowels", 4L, "consonants", 2L);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Counting the occurrences of a certain character - Unicode surrogate")
    void countingOccurrencesOfCharacterTest() {

        String mockString = "occurrences";
        String mockCharacter = "c";

        long result = countingOccurrencesOfCharacter(mockString, mockCharacter);

        long expectedResult = 3;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Counting the occurrences of a certain character functional style")
    void countingOccurrencesOfCharacterFunctionalStyleTest() {

        String mockString = "occurrences";
        char mockCharacter = 'c';

        long result = countingOccurrencesOfCharacterFunctionalStyle(mockString, mockCharacter);

        long expectedResult = 3;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Checking whether a string is a palindrome")
    void checkingWhetherStringIsPalindromeTest() {

        String mockString = "madam";

        boolean result = isPalindrome(mockString);

        assertTrue(result);
    }

    @Test
    @DisplayName("Checking whether a string is not a palindrome")
    void checkingWhetherStringIsNotPalindromeTest() {

        String mockString = "madame";

        boolean result = isPalindrome(mockString);

        assertFalse(result);
    }

    @Test
    @DisplayName("Checking whether a string is a palindrome with StringBuilder")
    void checkingWhetherStringIsPalindromeWithStringBuilderTest() {

        String mockString = "madam";

        boolean result = isPalindromeWithStringBuilder(mockString);

        assertTrue(result);
    }

    @Test
    @DisplayName("Checking whether a string is not a palindrome with StringBuilder")
    void checkingWhetherStringIsNotPalindromeWithStringBuilderTest() {

        String mockString = "madame";

        boolean result = isPalindromeWithStringBuilder(mockString);

        assertFalse(result);
    }

    @Test
    @DisplayName("Checking whether a string is a palindrome functional style")
    void checkingWhetherStringIsPalindromeFunctionalStyleTest() {

        String mockString = "madam";

        boolean result = isPalindromeFunctionalStyle(mockString);

        assertTrue(result);
    }

    @Test
    @DisplayName("Checking whether a string is not a palindrome functional style")
    void checkingWhetherStringIsNotPalindromeFunctionalStyleTest() {

        String mockString = "madame";

        boolean result = isPalindromeFunctionalStyle(mockString);

        assertFalse(result);
    }

    @Test
    @DisplayName("Removing duplicate characters")
    void removeDuplicatesTest() {

        String mockString = "abracadabra";

        String result = removeDuplicates(mockString);

        String expectedResult = "abrcd";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Removing duplicate characters - Functional Style")
    void removeDuplicatesFunctionalStyleTest() {

        String mockString = "abracadabra";

        String result = removeDuplicatesFunctionalStyle(mockString);

        String expectedResult = "abrcd";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Removing a given character")
    void removeCharacterTest() {

        String mockString = "abracadabra";

        String result = removeCharacter(mockString, 'a');

        String expectedResult = "brcdbr";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Removing a given character - Functional Style")
    void removeCharacterTestFunctionalStyleTest() {

        String mockString = "abracadabra";

        String result = removeCharacterFunctionalStyle(mockString, 'a');

        String expectedResult = "brcdbr";

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Finding the character with the most appearances (Functional Style)")
    void maxOccurrenceCharacterTest() {

        String mockString = "abracadabra";

        Map<Character, Long> result = maxOccurrenceCharacter(mockString);

        Map<Character, Long> expectedResult = Map.of('a', 5L);

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Counting substring occurrences in a string first Approach (11 in 111 occurs 1 time)")
    void countStringInStringFirstApproachTest() {

        String mockString = "abracadabra";

        String mockSearchString = "ab";

        Integer result = countStringInStringFirstApproach(mockString, mockSearchString);

        Integer expectedResult = 2;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Counting substring occurrences in a string second Approach (11 in 111 occurs 2 times)")
    void countStringInStringSecondApproachTest() {

        String mockString = "aaa";

        String mockSearchString = "aa";

        Integer result = countStringInStringSecondApproach(mockString, mockSearchString);

        Integer expectedResult = 2;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("concatStringsWithStreamReduce ; List of Strings ; return String")
    void concatStringsWithStreamReduceTest() {

        List<String> stringListMock = Arrays.asList("Vin", "ki", "gs");

        String result = concatStringsWithStreamReduce(stringListMock);

        String expectedResult = "Vinkigs";

        assertEquals(result, expectedResult);
    }
}