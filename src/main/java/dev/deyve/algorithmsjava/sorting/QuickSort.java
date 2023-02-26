package dev.deyve.algorithmsjava.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class QuickSort {

    private static final Logger logger = LoggerFactory.getLogger(QuickSort.class);

    public static Integer[] sort(Integer[] array) {
        return sort(array, 0, array.length - 1);
    }

    private static Integer[] sort(Integer[] array, Integer start, Integer end) {
        if (start >= end) {
            return array;
        }

        var boundary = partition(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);

        return array;
    }

    private static Integer partition(Integer[] array, Integer start, Integer end) {
        var pivot = array[end];
        var boundary = start - 1;

        for (var index = start; index <= end; index++) {
            if (array[index] <= pivot) {
                swap(array, index, ++boundary);
            }
        }
        return boundary;
    }

    private static void swap(Integer[] array, Integer firstIndex, Integer secondIndex) {

        var temporaryVariable = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporaryVariable;

        logger.info("Swap: {}", Arrays.toString(array));
    }
}
