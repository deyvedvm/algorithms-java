package dev.deyve.algorithmsjava.sorting;

import java.util.Arrays;

/**
 * Counting Sort
 */
public class CountingSort {

    public static Integer[] sort(Integer[] array) {
        if (array.length == 0) return new Integer[]{};

        var min = array[0];
        var max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            else if (array[i] > max) max = array[i];
        }

        Integer[] counts = new Integer[max - min + 1];
        Arrays.fill(counts, 0);

        for (Integer integer : array) counts[integer - min]++;

        int sortedIndex = 0;

        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                array[sortedIndex++] = i + min;
                counts[i]--;
            }
        }
        return array;
    }
}
