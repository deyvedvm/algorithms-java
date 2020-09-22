package dev.deyve.algorithmsjava.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    @DisplayName("bubbleSort ; should sort numbers ; return the numbers sorted")
    void sortTest() {
        Integer[] numbers = {7, 3, 1, 4, 6, 2, 3};

        Integer[] result = BubbleSort.sort(numbers);

        Integer[] expectedResult = {1, 2, 3, 3, 4, 6, 7};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }
}