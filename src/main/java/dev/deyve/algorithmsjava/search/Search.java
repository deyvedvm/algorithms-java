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

}
