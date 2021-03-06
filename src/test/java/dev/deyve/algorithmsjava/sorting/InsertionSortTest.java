package dev.deyve.algorithmsjava.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Insertion Sort Test
 */
@DisplayName("Insertion Sort Test")
class InsertionSortTest {

    @Test
    @DisplayName("Insertion Sort ; should sort numbers ; return the numbers sorted")
    void sortTest() {
        Integer[] numbers = {20, 35, -15, 7, 55, 1, -22};

        Integer[] result = InsertionSort.sort(numbers);

        Integer[] expectedResult = {-22, -15, 1, 7, 20, 35, 55};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

}