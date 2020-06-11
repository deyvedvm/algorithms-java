package dev.deyve.algorithmsjava.utils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Number Utils
 */
public class NumberUtils {

    /**
     * Sum of Integers
     *
     * @param integers List of Integers
     * @return sum
     */
    static int sumOfIntegers(List<Integer> integers) {

        if (Objects.isNull(integers)) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return integers
                .stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
    }

    /**
     * Sum of Integers with stream reduce
     *
     * @param integers List of Integers
     * @return sum
     */
    static int sumOfIntegersWithReduce(List<Integer> integers) {

        return integers.stream().reduce(0, Integer::sum);
    }

    /**
     * Count duplicate numbers
     *
     * @param numbers List of Numbers
     * @return Number of duplicate numbers
     */
    static int countDuplicate(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        return numbers.stream()
                .filter(number -> !uniqueNumbers.add(number))
                .collect(Collectors.toSet())
                .size();
    }

    /**
     * Count Number Occurrences
     *
     * @param numbers Array of Integers
     * @param value   Value to count
     * @return Number occurrences
     */
    static Integer getNumberOccurrences(Integer[] numbers, Integer value) {
        return (int) Arrays.stream(numbers)
                .filter(number -> number.equals(value))
                .count();
    }
}
