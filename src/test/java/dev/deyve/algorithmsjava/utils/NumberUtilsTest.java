package dev.deyve.algorithmsjava.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static dev.deyve.algorithmsjava.utils.NumberUtils.*;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    @DisplayName("Sum of Integers ; should sum a list of integers ; return sum of integers")
    void sumOfIntegersTest() {

        List<Integer> mockIntegers = List.of(2, 3, 5, 10);

        Integer result = sumOfIntegers(mockIntegers);

        Integer expectedResult = 20;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Sum of Integers ; should try to sum a null list ; throw exception")
    void sumOfIntegersWithNullListTest() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> sumOfIntegers(null));

        String actualMessage = exception.getMessage();

        String expectedMessage = "List cannot be null";

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("Sum of Integers ; should sum a list of integers with null elements ; return sum of integers")
    void sumOfIntegersWithNullElementsTest() {

        List<Integer> mockIntegers = new ArrayList<>(List.of(2, 3, 5));

        mockIntegers.add(null);

        Integer result = sumOfIntegers(mockIntegers);

        Integer expectedResult = 10;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Sum of Integers with reduce ; should sum a list of integers ; return sum of integers")
    void sumOfIntegersWithReduceTest() {

        List<Integer> mockIntegers = List.of(2, 3, 5, 10);

        Integer result = sumOfIntegersWithReduce(mockIntegers);

        Integer expectedResult = 20;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Count duplicate numbers ; should count duplicate numbers ; return the number of duplicate numbers ")
    void countDuplicateTest() {

        List<Integer> mockIntegers = List.of(2, 2, 3, 5, 5, 10);

        Integer result = countDuplicate(mockIntegers);

        Integer expectedResult = 2;

        assertEquals(result, expectedResult);
    }

    @Test
    @DisplayName("Count number occurrences ; should count number occurrences ; return the number of occurrences")
    void getNumberOccurrencesTest() {

        Integer valueMock = 5;

        Integer[] mockIntegers = {2, 2, 3, 5, 5, 5, 10};

        Integer result = getNumberOccurrences(mockIntegers, valueMock);

        Integer expectedResult = 3;

        assertEquals(result, expectedResult);
    }
}
