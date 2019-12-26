package dev.deyve.algorithmsjava.strings;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class StringUtils {

    private static final int EXTENDED_ASCII_CODES = 256;

    private static final String WHITESPACE = " ";

    private static final Pattern PATTERN = Pattern.compile(" +");

    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    /**
     * Counting Duplicate Characters
     *
     * @param str String
     * @return Map with Character and number of occurrences
     */
    Map<Character, Integer> countingDuplicateCharacters(String str) {

        Map<Character, Integer> result = new HashMap<>();

        IntStream.range(0, str.length())
                .forEach(charIndex -> {

                    char charAt = str.charAt(charIndex);

                    result.compute(charAt, (key, value) -> (value == null) ? 1 : ++value);
                });

        return result;
    }


    /**
     * Counting Duplicate Characters with Stream
     *
     * @param str String
     * @return Map with Character and number of occurrences
     */
    Map<Character, Long> countDuplicateCharactersStream(String str) {

        IntStream intStream = str.chars();

        return intStream
                .mapToObj(charAt -> (char) charAt)
                .collect(groupingBy(c -> c, counting()));
    }

    /**
     * Finding the first non-repeated character
     *
     * @param str String
     * @return The character
     */
    char firstNonRepeatedCharacter(String str) {

        int[] flags = IntStream
                .range(0, EXTENDED_ASCII_CODES)
                .map(i -> -1)
                .toArray();

        for (int index = 0; index < str.length(); index++) {

            char charAt = str.charAt(index);

            if (flags[charAt] == -1) {
                flags[charAt] = index;
            } else {
                flags[charAt] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {

            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    /**
     * Finding the first non-repeated character with LinkedHashMap
     *
     * @param str String
     * @return The character
     */
    char firstNonRepeatedCharacterLinkedHashMap(String str) {

        Map<Character, Integer> chars = new LinkedHashMap<>();

        IntStream.range(0, str.length())
                .forEach(index -> {
                    char charAt = str.charAt(index);
                    chars.compute(charAt, (key, value) -> (value == null) ? 1 : ++value);
                });

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    /**
     * Reversing letters and words
     *
     * @param str String
     * @return Reversed String
     */
    String reverseWords(String str) {

        String[] words = str.split(WHITESPACE);

        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {

            StringBuilder reverseWord = new StringBuilder();

            for (int index = word.length() - 1; index >= 0; index--) {
                reverseWord.append(word.charAt(index));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

    /**
     * Reversing letters and words functional style
     *
     * @param str String
     * @return Reversed String
     */
    String reverseWordsFunctionalStyle(String str) {

        return PATTERN.splitAsStream(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    /**
     * Checking whether a string contains only digits
     *
     * @param str String
     * @return boolean
     */
    boolean checkingWhetherStringContainsOnlyDigits(String str) {

        // Other solution is using regular expression
        // return str.matches("[0-9]+");

        return str.chars().allMatch(Character::isDigit);
    }

    /**
     * Counting vowels and consonants
     *
     * @param str String
     * @return Map of String and Integer
     */
    Map<String, Integer> countVowelsAndConsonants(String str) {

        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int index = 0; index < str.length(); index++) {
            char charAt = str.charAt(index);

            if (allVowels.contains(charAt)) {
                vowels++;
            } else if (charAt >= 'a' && charAt <= 'z') {
                consonants++;
            }
        }

        return Map.of("vowels", vowels, "consonants", consonants);
    }

    /**
     * Counting vowels and consonants functional style
     *
     * @param str String
     * @return Map of String and Long
     */
    Map<String, Long> countVowelsAndConsonantsFunctionalStyle(String str) {

        str = str.toLowerCase();

        long vowels = str.chars()
                .filter(charAt -> allVowels.contains((char) charAt))
                .count();

        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Map.of("vowels", vowels, "consonants", consonants);
    }

    /**
     * Counting the occurrences of a certain character - Unicode surrogate
     *
     * @param str String
     * @param ch  String
     * @return long
     */
    long countingOccurrencesOfCharacter(String str, String ch) {

        if (ch.codePointCount(0, ch.length()) > 1) {
            // there is more than 1 Unicode character in the given String
            return -1;
        }

        int result = str.length() - str.replace(ch, "").length();

        // if ch.length() return 2 then this is a Unicode surrogate pair
        return ch.length() == 2 ? result / 2 : result;
    }

    /**
     * Counting the occurrences of a certain character functional style
     * <p>
     * For third-party library support, please consider Spring Framework, StringUtils.countOccurrencesOf()
     *
     * @param str String
     * @param ch  String
     * @return long
     */
    long countingOccurrencesOfCharacterFunctionalStyle(String str, char ch) {

        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    /**
     * Checking whether a string is a palindrome - "default" solution
     *
     * @param str String
     * @return boolean
     */
    public boolean isPalindrome(String str) {

        int size = str.length();

        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) != str.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checking whether a string is a palindrome with StringBuilder
     *
     * @param str String
     * @return boolean
     */
    public boolean isPalindromeWithStringBuilder(String str) {

        String reversedString = new StringBuilder(str).reverse().toString();

        return str.equals(reversedString);
    }

    /**
     * Checking whether a string is a palindrome functional style
     *
     * @param str String
     * @return boolean
     */
    public boolean isPalindromeFunctionalStyle(String str) {

        return IntStream.range(0, str.length() / 2)
                .noneMatch(letter -> str.charAt(letter) != str.charAt(str.length() - letter - 1));
    }

    /**
     * Removing duplicate characters
     *
     * @param str String
     * @return String
     */
    public String removeDuplicates(String str) {

        char[] chars = str.toCharArray();

        StringBuilder builder = new StringBuilder();

        Set<Character> characters = new HashSet<>();

        for (char ch : chars) {
            if (characters.add(ch)) {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    /**
     * Removing duplicate characters - Functional Style
     *
     * @param str String
     * @return String
     */
    public String removeDuplicatesFunctionalStyle(String str) {

        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }

    /**
     * Removing a given character
     *
     * @param str String
     * @param ch  Char
     * @return String
     */
    public String removeCharacter(String str, char ch) {

        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    /**
     * Removing a given character (Functional Style)
     *
     * @param str String
     * @param ch  Char
     * @return String
     */
    public String removeCharacterFunctionalStyle(String str, char ch) {

        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    /**
     * Finding the character with the most appearances - Functional Style
     *
     * @param str String
     * @return Map of Character and Long
     */
    public Map<Character, Long> maxOccurenceCharacter(String str) {

        return str.chars()
                .filter(ch -> !Character.isWhitespace(ch))
                .mapToObj(ch -> (char) ch)
                .collect(groupingBy(ch -> ch, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(pair -> Map.of(pair.getKey(), pair.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));
    }

}
