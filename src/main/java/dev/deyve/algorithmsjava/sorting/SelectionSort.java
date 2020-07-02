package dev.deyve.algorithmsjava.sorting;

import java.util.Arrays;

/**
 * Selection Sort
 */
public class SelectionSort {

    public static Integer[] sort(Integer[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }

            }
            swap(array, largest, lastUnsortedIndex);
        }

        return array;
    }

    private static void swap(Integer[] array, Integer firstIndex, Integer secondIndex) {

        Integer temporaryVariable = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporaryVariable;

        System.out.println("Swap: " + Arrays.toString(array));
    }
}
