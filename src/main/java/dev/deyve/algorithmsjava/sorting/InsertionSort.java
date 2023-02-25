package dev.deyve.algorithmsjava.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Insertion Sort
 */
public class InsertionSort {

    private static final Logger logger = LoggerFactory.getLogger(InsertionSort.class);

    public static Integer[] sort(Integer[] array) {

        logger.info("Initial array: {}", Arrays.toString(array));

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }

        logger.info("Final array: {}", Arrays.toString(array));

        return array;
    }
}
