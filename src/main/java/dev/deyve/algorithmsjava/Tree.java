package dev.deyve.algorithmsjava;

/**
 * Tree
 */
public class Tree {

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            this.root = node;
        }

        var current = root;

        while (true) {

            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

}

