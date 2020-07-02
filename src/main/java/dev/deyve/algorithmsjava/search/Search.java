package dev.deyve.algorithmsjava.search;

import java.util.List;

public class Search {

    public <T extends Comparable<T>> Integer binarySearch(List<T> sortedArray, T element) {

        var lowIndex = 0;
        var highIndex = sortedArray.size() -1;

        while (lowIndex <= highIndex) {

            int middleIndex = (lowIndex + highIndex) / 2;

            if (sortedArray.get(middleIndex).compareTo(element) == 0) {
                return middleIndex;
            } else if (sortedArray.get(middleIndex).compareTo(element) < 0) {
                lowIndex = middleIndex + 1;
            } else {
                highIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    public static <T extends Comparable<T>> T bubbleSort(List<T> array) {

        for (int lastUnsortedIndex = array.size() - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {

                if (array.indexOf(i) > array.indexOf(i + 1)) {

                    swap(array, i, i + 1);
                }
            }
        }

        return null;
    }

    private static <T extends Comparable<T>> void swap(List<T> array, int i, int j) {

        if (i == j) {
            return;
        }

        T temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

}
