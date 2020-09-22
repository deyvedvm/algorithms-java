package dev.deyve.algorithmsjava.sorting;

import java.util.Arrays;

/**
 * Bubble Sort
 */
public class BubbleSort {

    public static Integer[] sort(Integer[] array) {

        long initialTime = System.currentTimeMillis();

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }

        long finalTime = System.currentTimeMillis();

        long totalTime = finalTime - initialTime;

        System.out.println("Total time: " + totalTime + " milliseconds");

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
