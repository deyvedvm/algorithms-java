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
    @DisplayName("Insertion Sort ; should sort empty array ; return empty array")
    void sortTestWithEmptyArray() {
        Integer[] numbers = {};

        Integer[] result = InsertionSort.sort(numbers);

        Integer[] expectedResult = {};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

    @Test
    @DisplayName("Insertion Sort ; should sort array with one element ; return array with one element")
    void sortTestWithOneElement() {
        Integer[] numbers = {7};

        Integer[] result = InsertionSort.sort(numbers);

        Integer[] expectedResult = {7};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

    @Test
    @DisplayName("Insertion Sort ; should sort numbers ; return the numbers sorted")
    void sortTest() {
        Integer[] numbers = {20, 35, -15, 7, 55, 1, -22};

        Integer[] result = InsertionSort.sort(numbers);

        Integer[] expectedResult = {-22, -15, 1, 7, 20, 35, 55};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

}