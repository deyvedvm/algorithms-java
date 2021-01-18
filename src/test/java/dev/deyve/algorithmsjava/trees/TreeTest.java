package dev.deyve.algorithmsjava.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tree Test
 */
class TreeTest {

    Tree tree;

    @BeforeEach
    void setUp() {
        tree = new Tree();

        tree.insert(5);
    }

    @Test
    @DisplayName("Should insert 3 in the left node")
    void shouldInsertTwoNodesTest() {

        tree.insert(3);

        assertEquals(tree.getRoot().leftChild.value, 3);
    }

    @Test
    @DisplayName("Should insert 8 in the right node")
    void shouldInsertThreeNodesTest() {

        tree.insert(8);

        assertEquals(tree.getRoot().rightChild.value, 8);
    }

    @Test
    @DisplayName("Should find 3 in the tree")
    void shouldFindRootNodeTest() {

        tree.insert(3);
        tree.insert(8);

        boolean result = tree.find(3);

        assertTrue(result);
    }

    @Test
    @DisplayName("Should not find 10 in the tree")
    void shouldNotFindRootNodeTest() {

        tree.insert(3);
        tree.insert(8);

        boolean result = tree.find(10);

        assertFalse(result);
    }
}