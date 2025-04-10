package dev.deyve.algorithmsjava.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Function<Integer, Integer> incrementX = x -> x + 1;

        logger.info(String.valueOf(incrementX.apply(5)));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean anyEven = numbers.stream().anyMatch(number -> number % 2 == 0);
        logger.info(String.valueOf(anyEven)); // prints "true"

        logger.info(String.valueOf(Runtime.getRuntime().availableProcessors()));

        int[] integers = new int[]{1, 5, 4, 9, 8, 3, 2};
        Arrays.sort(integers);
        logger.info(Arrays.toString(integers));

        Melon[] melons = new Melon[]{new Melon("1", 15), new Melon("2", 10)};

        Arrays.parallelSort(melons, Comparator.comparingInt(Melon::weight).reversed());

        logger.info(Arrays.toString(melons));

        int[] descIntegers = Arrays.stream(integers)
                .boxed() //or .mapToObj(i -> i)
                .sorted((i1, i2) -> Integer.compare(i2, i1))
                .mapToInt(Integer::intValue)
                .toArray();

        logger.info(Arrays.toString(descIntegers));
    }

    public static String[] filterWords(String[] words, String letters) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (letters.indexOf(letter) >= 0) {
                    result.add(word);
                    break;
                }
            }
        }

        return result.toArray(new String[0]);
    }

}
