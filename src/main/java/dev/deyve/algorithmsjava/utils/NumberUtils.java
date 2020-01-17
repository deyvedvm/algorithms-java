package dev.deyve.algorithmsjava.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NumberUtils {

    /**
     * Sum of Integers
     *
     * @param integers List of Integers
     * @return sum
     */
    static int sumOfIntegers(List<Integer> integers) {

       /* List<String> letters = Arrays.asList("a", "b", "c", "d", "e");

        String reduceStrings = letters.stream().reduce("", String::concat);

        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));

        Integer computedAges = users
                .stream()
                .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);*/


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
    static int sumOfIntegersWithReduce(List<Integer> integers){

        return integers.stream().reduce(0, Integer::sum);
    }

}
