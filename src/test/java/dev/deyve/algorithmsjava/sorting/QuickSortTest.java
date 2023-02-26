package dev.deyve.algorithmsjava.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("QuickSort Test")
class QuickSortTest {

    @Test
    @DisplayName("quick sort ; should sort ; return the empty array")
    void sortTestWithArrayEmpty() {
        Integer[] numbers = {};

        Integer[] result = QuickSort.sort(numbers);

        Integer[] expectedResult = new Integer[]{};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

    @Test
    @DisplayName("quick sort ; should sort array ; return the array with one element")
    void sortTestWithOneElement() {
        Integer[] numbers = {7};

        Integer[] result = QuickSort.sort(numbers);

        Integer[] expectedResult = {7};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

    @Test
    @DisplayName("quick sort ; should sort array ; return the array with two elements")
    void sortTestWithTwoElement() {
        Integer[] numbers = {7, 3};

        Integer[] result = QuickSort.sort(numbers);

        Integer[] expectedResult = {3, 7};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

    @Test
    @DisplayName("quick sort ; should sort numbers ; return the numbers sorted")
    void sortTest() {
        Integer[] numbers = {7, 3, 1, 4, 6, 2, 3};

        Integer[] result = QuickSort.sort(numbers);

        Integer[] expectedResult = {1, 2, 3, 3, 4, 6, 7};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }
}