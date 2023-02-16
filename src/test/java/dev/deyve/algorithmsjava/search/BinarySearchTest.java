package dev.deyve.algorithmsjava.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    static void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    @DisplayName("binarySearch ; should check if string exists in array of strings; return index")
    void binarySearchStringTest() {
        String[] words = new String[]{"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel",
                "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec",
                "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee", "Zulu"};

        int result = binarySearch.search(Arrays.asList(words), "Foxtrot");

        assertEquals(5, result);
    }

    @Test
    @DisplayName("binarySearch ; should check if string exists in array of List; return index")
    void binarySearchListTest() {
        List<String> words = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        int result = binarySearch.search(words, "September");

        assertEquals(8, result);
    }

    @Test
    @DisplayName("binarySearch ; should check if number exists in array ; return index")
    void binarySearchNumberTest() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 12, 15, 20, 30, 45);

        int result = binarySearch.search(numbers, 12);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("binarySearch ; should check if string not exists in array of List ; return -1")
    void binarySearchListNotFoundTest() {
        List<String> words = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        int result = binarySearch.search(words, "Monday");

        assertEquals(-1, result);
    }

    @Test
    @DisplayName("binarySearch using Java 17 ; should check if number exists in array ; return index")
    void binarySearchUsingJava17Found() {
        int[] numbers = {1, 2, 4, 5, 7, 9, 11};

        int resultFound = Arrays.binarySearch(numbers, 5);

        assertEquals(3, resultFound);

    }

    @Test
    @DisplayName("binarySearch using Java 17 ; should check if string not exists in array of List ; return -1")
    void binarySearchUsingJava17NotFound() {
        int[] numbers = {1, 2, 4, 5, 7, 9, 11};

        int resultNotFound = Arrays.binarySearch(numbers, 12);
        assertEquals(-8, resultNotFound);
    }
}
