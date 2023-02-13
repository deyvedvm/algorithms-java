package dev.deyve.algorithmsjava.search;

import java.util.List;

public class Search {

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
