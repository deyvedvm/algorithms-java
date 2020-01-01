package dev.deyve.algorithmsjava.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    private static Search search;

    @BeforeAll
    static void setUp() {
        search = new Search();
    }

    @Test
    @DisplayName("binarySearch ; should check if string exists in array of strings; return index")
    void binarySearchStringTest() {
        String[] words = new String[]{"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel",
                "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec",
                "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee", "Zulu"};

        int result = search.binarySearch(Arrays.asList(words), "Foxtrot");

        assertEquals(result, 5);
    }

    @Test
    @DisplayName("binarySearch ; should check if string exists in array of List; return index")
    void binarySearchListTest() {
        List<String> words = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        int result = search.binarySearch(words, "September");

        assertEquals(result, 8);
    }

    @Test
    @DisplayName("binarySearch ; should check if number exists in array ; return index")
    void binarySearchNumberTest() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 12, 15, 20, 30, 45);

        int result = search.binarySearch(numbers, 12);

        assertEquals(result, 3);
    }

    @Test
    @DisplayName("binarySearch ; should check if string not exists in array of List; return -1")
    void binarySearchListNotFoundTest() {
        List<String> words = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        int result = search.binarySearch(words, "Monday");

        assertEquals(result, -1);
    }
}