package dev.deyve.algorithmsjava.trees;

import lombok.ToString;

/**
 * Node
 */
@ToString
public class Node {

    protected Integer value;

    protected Node leftChild;

    protected Node rightChild;

    Node(Integer value) {
        this.value = value;
    }
}
