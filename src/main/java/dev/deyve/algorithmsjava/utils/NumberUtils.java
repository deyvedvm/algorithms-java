package dev.deyve.algorithmsjava.utils;

import java.util.List;
import java.util.Objects;

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

}
