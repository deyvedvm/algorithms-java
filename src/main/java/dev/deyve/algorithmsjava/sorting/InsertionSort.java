package dev.deyve.algorithmsjava.sorting;

import java.util.Arrays;

/**
 * Insertion Sort
 */
public class InsertionSort {

    public static Integer[] sort(Integer[] array) {

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }

        System.out.println("Final array: " + Arrays.toString(array));

        return array;
    }
}
