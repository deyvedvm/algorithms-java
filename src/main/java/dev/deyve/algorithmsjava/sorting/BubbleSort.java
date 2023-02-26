package dev.deyve.algorithmsjava.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Bubble Sort
 */
public class BubbleSort {

    private static final Logger logger = LoggerFactory.getLogger(BubbleSort.class);

    public static Integer[] sort(Integer[] array) {

        long initialTime = System.currentTimeMillis();

        logger.info("Initial array: {}", Arrays.toString(array));

        for (var i = 0; i < array.length; i++) {
            for (var j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }

        long finalTime = System.currentTimeMillis();

        long totalTime = finalTime - initialTime;

        logger.info("Total time:: {} milliseconds", totalTime);

        logger.info("Final array: {}", Arrays.toString(array));

        return array;
    }

    public static <T> void bubbleSortWithComparator(T[] array, Comparator<? super T> comparator) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void swap(Integer[] array, Integer firstIndex, Integer secondIndex) {

        var temporaryVariable = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporaryVariable;

        logger.info("Swap: {}", Arrays.toString(array));
    }
}
