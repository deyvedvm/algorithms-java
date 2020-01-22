package dev.deyve.algorithmsjava.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static dev.deyve.algorithmsjava.streams.Streams.sumValuesFromObject;
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
    @DisplayName("sumValuesFromObject; List of Objects ; return a sum of values")
    void sumValuesFromObjectTest() {
        List<User> users = Arrays.asList(john, julie);

        Integer result = sumValuesFromObject(users);

        Integer expectedResult = 77;

        assertEquals(result, expectedResult);
    }
}