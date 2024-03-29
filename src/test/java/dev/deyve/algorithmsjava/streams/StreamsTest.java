package dev.deyve.algorithmsjava.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static dev.deyve.algorithmsjava.streams.Streams.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Java 8+ Streams Tests
 */
class StreamsTest {

    User john;
    User julie;

    @BeforeEach
    void setUp() {

        john = User.builder().name("John").age(41).build();

        julie = User.builder().name("Julie").age(36).build();
    }

    @Test
    @DisplayName("Sum values from Object ; should receive a List of Objects ; return a sum of values")
    void sumValuesFromObjectTest() {
        List<User> users = Arrays.asList(john, julie);

        Integer result = sumValuesFromObject(users);

        assertEquals(77, result);
    }

    @Test
    @DisplayName("Filter string list ; should receive a list of strings ; return a list of strings filtered")
    void filterStringListTest() {

        List<String> mockStrings = Arrays.asList("apples", "oranges", "pear", "bananas", "avocados", "apricots");

        String mockString = "a";

        List<String> result = filterStringList(mockStrings, mockString);

        assertEquals(Arrays.asList("apples", "avocados", "apricots"), result);
    }

    @Test
    @DisplayName("Filter Strings with Predicate ; should receive a list of strings ; return a list of strings filtered")
    void filterStringsWithPredicateTest() {

        List<String> mockStrings = Arrays.asList("apples", "oranges", "pear", "bananas", "avocados", "apricots");

        Predicate<String> predicateA = string -> string.startsWith("a");

        Predicate<String> predicateB = string -> string.startsWith("b");

        Predicate<String> predicateN = string -> string.contains("n");

        Predicate<String> stringPredicate = predicateA.or(predicateB).and(predicateN.negate());

        List<String> result = filterStringsWithPredicate(mockStrings, stringPredicate);

        assertEquals(Arrays.asList("apples", "avocados", "apricots"), result);
    }
}