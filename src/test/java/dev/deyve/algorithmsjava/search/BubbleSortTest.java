package dev.deyve.algorithmsjava.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static dev.deyve.algorithmsjava.search.BubbleSort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    private Integer[] integerArray;

    @BeforeEach
    void setUp() {
        this.integerArray = new Integer[]{20, 35, -15, 7, 55, 1, -22};
    }

    @Test
    @DisplayName("sort - should swap unordered elements")
    void shouldSwapUnorderedElements() {
        Integer[] orderedElements = sort(integerArray);

        Integer[] expected = {-22, -15, 1, 7, 20, 35, 55};

        assertEquals(Arrays.toString(expected), Arrays.toString(orderedElements));
    }

    @Test
    @DisplayName("sort - should swap shuffle elements")
    void shouldSwapShuffleElements() {
        Collections.shuffle(Arrays.asList(integerArray));

        Integer[] orderedElements = sort(integerArray);

        Integer[] expected = {-22, -15, 1, 7, 20, 35, 55};

        assertEquals(Arrays.toString(expected), Arrays.toString(orderedElements));
    }

    @Test
    @DisplayName("sort - should swap random elements")
    void shouldSwapRandomElements() {
        Integer[] randomArray = generateRandomArray(7);

        Integer[] expected = randomArray.clone();

        Integer[] result = sort(randomArray);

        Arrays.sort(expected);

        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    private Integer[] generateRandomArray(Integer size) {

        Random random = new Random();

        Integer[] array = new Integer[size];

        for (int index = 0; index < size; index++) {
            array[index] = random.nextInt(100);
        }

        return array;
    }
}