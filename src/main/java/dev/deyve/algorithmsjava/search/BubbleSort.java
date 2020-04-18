package dev.deyve.algorithmsjava.search;

import java.util.Arrays;

/**
 * Bubble Sort
 */
public class BubbleSort {

    public static Integer[] sort(Integer[] array) {

        long initialTime = System.currentTimeMillis();

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int firstUnsortedIndex = 0; firstUnsortedIndex < array.length - 1; firstUnsortedIndex++) {

            for (int index = 0; index < array.length - firstUnsortedIndex - 1; index++) {

                if (array[index] > array[index + 1]) {
                    swap(array, index, index + 1);
                }
            }
        }

        long finalTime = System.currentTimeMillis();

        long totalTime = finalTime - initialTime;

        System.out.println("Total time: " + totalTime + " milliseconds");

        return array;
    }

    private static void swap(Integer[] array, Integer firstIndex, Integer secondIndex) {

        Integer temporaryVariable = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporaryVariable;

        System.out.println("Swap: " + Arrays.toString(array));
    }
}
