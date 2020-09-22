package dev.deyve.algorithmsjava.sorting;

import java.util.Arrays;

/**
 * Selection Sort
 */
public class SelectionSort {

    public static Integer[] sort(Integer[] array) {

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            var minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }

        System.out.println("Final array: " + Arrays.toString(array));

        return array;
    }

    private static void swap(Integer[] array, Integer firstIndex, Integer secondIndex) {

        Integer temporaryVariable = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporaryVariable;

        System.out.println("Swap: " + Arrays.toString(array));
    }
}
