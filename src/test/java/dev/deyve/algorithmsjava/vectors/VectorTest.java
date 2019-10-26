package dev.deyve.algorithmsjava.vectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Vector Test
 */
class VectorTest {

    private Vector<Object> vector;

    private String first;
    private String second;
    private String third;
    private String fourth;

    @BeforeEach
    void setUp() {
        this.vector = new Vector<>(3);

        first = "first";
        second = "second";
        third = "third";
        fourth = "fourth";
    }

    @Test
    @DisplayName("Should Check the length of the vector")
    void ShouldCheckTheLengthOfTheVector() {

        assertEquals(vector.getElements().length, 3);
    }

    @Test
    @DisplayName("Should add Element to Vector and increase the length of the vector")
    void shouldAddElementToVectorAndIncreasesTheLength() {

        vector.add(first);
        vector.add(second);
        vector.add(third);

        boolean added = vector.add(fourth);

        assertTrue(added);

        assertEquals(vector.getElements().length, 6);

        assertEquals(vector.getElements()[0], first);
        assertEquals(vector.getElements()[1], second);
        assertEquals(vector.getElements()[2], third);
        assertEquals(vector.getElements()[3], fourth);
    }

    @Test
    @DisplayName("Should Add Element In First Position")
    void shouldAddElementFirstInPosition() {

        vector.add(second);
        vector.add(third);

        boolean added = vector.add(0, first);

        assertTrue(added);

        assertEquals(vector.getElements()[0], first);
    }

    @Test
    @DisplayName("Should Throws an IllegalArgumentException When an Add Element")
    void shouldThrowsExceptionWhenAddElement() {

        vector.add(first);
        vector.add(second);

        assertThrows(IllegalArgumentException.class, () -> vector.add( 2, third));
    }

    @Test
    @DisplayName("Should Return Size Of Vector")
    void shouldReturnSizeOfVector() {

        vector.add(first);
        vector.add(second);

        Integer size = vector.size();

        assertEquals(size, 2);
    }

    @Test
    @DisplayName("Should Find an Element By Position")
    void shouldFindElementByPosition() {

        vector.add(first);
        vector.add(second);

        Object firstElement = vector.find(0);
        assertEquals(firstElement, first);

        Object secondElement = vector.find(1);
        assertEquals(secondElement, second);
    }

    @Test
    @DisplayName("Should Throws Exception when find an Element by Position")
    void shouldFindElementByPositionAndThrowsException() {

        vector.add(first);
        vector.add(second);

        assertThrows(IllegalArgumentException.class, () -> vector.find(2));
    }

    @Test
    @DisplayName("Should Find an Element")
    void shouldFindElement() {

        vector.add(first);
        vector.add(second);

        assertEquals(vector.find(first), 0);
        assertEquals(vector.find(second), 1);

        assertEquals(vector.find(third), -1);
    }

    @Test
    @DisplayName("Should Find Last Index")
    void shouldFindLastIndex() {

        vector.add(first);
        vector.add(second);
        vector.add(first);

        int lastIndex = vector.lastIndex(first);

        assertEquals(lastIndex, 2);
    }

    @Test
    @DisplayName("Should Check If Contains an Element")
    void shouldCheckIfContains() {

        vector.add(first);
        vector.add(second);

        boolean containsFirst = vector.contains(first);
        boolean containsSecond = vector.contains(second);

        boolean containsThird = vector.contains(third);

        assertTrue(containsFirst);
        assertTrue(containsSecond);

        assertFalse(containsThird);
    }

    @Test
    @DisplayName("Should Remove an Element from Vector by position")
    void shouldRemoveElementByPosition() {

        vector.add(first);
        vector.add(second);
        vector.add(third);
        vector.add(fourth);

        vector.remove(1);

        assertEquals(vector.getElements()[1], third);
    }


    @Test
    @DisplayName("Should Remove an Element from Vector")
    void shouldRemoveElement() {

        vector.add(first);
        vector.add(second);
        vector.add(third);
        vector.add(fourth);

        vector.remove(second);

        assertEquals(vector.getElements()[1], third);
    }

    @Test
    @DisplayName("Should clear Vector")
    void shouldClearVector() {

        vector.add(first);
        vector.add(second);
        vector.add(first);

        vector.clear();

        assertEquals(vector.size(), 0);
    }

}