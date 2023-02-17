package dev.deyve.algorithmsjava.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {

    @Test
    @DisplayName("mergeSort ; should sort array ; return array sorted")
    void mergeSortTest() {
        int[] numbers = {1, 5, 6, 7, 3, 2, 4};

        int[] result = MergeSort.mergeSort(numbers);

        Integer[] expectedResult = {1, 2, 3, 4, 5, 6, 7};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }
}
