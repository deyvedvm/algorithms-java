package dev.deyve.algorithmsjava.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class StringUtils {


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
}
