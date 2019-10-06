package dev.deyve.algorithmsjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * Tree Test
 */
class TreeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Should call insert one time")
    void shouldInsertOneNodeWith() {

        Tree mockTree = mock(Tree.class);

        mockTree.insert(5);

        verify(mockTree, times(1)).insert(5);
    }

    @Test
    @DisplayName("Should call insert two times")
    void shouldInsertTwoNodes() {

        Tree mockTree = mock(Tree.class);

        mockTree.insert(5);
        mockTree.insert(3);

        verify(mockTree, times(1)).insert(5);
        verify(mockTree, times(1)).insert(3);
    }

    @Test
    @DisplayName("Should call insert three times")
    void shouldInsertThreeNodes() {

        Tree mockTree = mock(Tree.class);

        mockTree.insert(5);
        mockTree.insert(3);
        mockTree.insert(8);

        verify(mockTree, times(1)).insert(5);
        verify(mockTree, times(1)).insert(3);
        verify(mockTree, times(1)).insert(8);
    }

}