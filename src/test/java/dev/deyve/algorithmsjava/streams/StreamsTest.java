package dev.deyve.algorithmsjava.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("sumValuesFromObject; List of Objects ; return a sum of values")
    void sumValuesFromObject() {

        User john = User.builder().name("John").age(41).build();

        User julie = User.builder().name("Julie").age(36).build();

        List<User> users = Arrays.asList(john, julie);

        Integer result = Streams.sumValuesFromObject(users);

        Integer expectedResult = 77;

        assertEquals(result, expectedResult);
    }
}