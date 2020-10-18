package dev.deyve.algorithmsjava.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tree Test
 */
class TreeTest {

    Tree tree;

    @BeforeEach
    void setUp() {
        tree = new Tree();
    }

    @Test
    @DisplayName("Should insert 5 in the root node")
    void shouldInsertOneNodeWith() {

        tree.insert(5);

        assertEquals(tree.getRoot().value.toString(), "5");
    }

    @Test
    @DisplayName("Should insert 3 in the left node")
    void shouldInsertTwoNodes() {

        tree.insert(5);
        tree.insert(3);

        assertEquals(tree.getRoot().leftChild.value.toString(), "3");
    }

    @Test
    @DisplayName("Should insert 8 in the right node")
    void shouldInsertThreeNodes() {

        tree.insert(5);
        tree.insert(3);
        tree.insert(8);

        assertEquals(tree.getRoot().rightChild.value.toString(), "8");
    }
}