package dev.deyve.algorithmsjava.search;

public class Search {

    public <T extends Comparable<T>> Integer binarySearch(T[] sortedArray, T element) {

        var lowIndex = 0;
        var highIndex = sortedArray.length -1;

        while (lowIndex <= highIndex) {

            int middleIndex = (lowIndex + highIndex) / 2;

            if (sortedArray[middleIndex].compareTo(element) == 0) {
                return middleIndex;
            } else if (sortedArray[middleIndex].compareTo(element) < 0) {
                lowIndex = middleIndex + 1;
            } else {
                highIndex = middleIndex - 1;
            }
        }

        return 0;
    }

}
