package dev.deyve.algorithmsjava.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUtils {

    private static final int EXTENDED_ASCII_CODES = 256;

    /**
     * Counting Duplicate Characters
     *
     * @param str String
     * @return Map with Character and number of occurrences
     */
    public Map<Character, Integer> countingDuplicateCharacters(String str) {

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
    public Map<Character, Long> countDuplicateCharactersStream(String str) {

        IntStream intStream = str.chars();

        Map<Character, Long> result = intStream
                .mapToObj(charAt -> (char) charAt)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }

    /**
     * Finding the first non-repeated character
     *
     * @param str String
     * @return The character
     */
    public char firstNonRepeatedCharacter(String str) {

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
    public char firstNonRepeatedCharacterLinkedHashMap(String str) {

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

}
