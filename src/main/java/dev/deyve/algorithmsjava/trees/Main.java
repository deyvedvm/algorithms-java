package dev.deyve.algorithmsjava.trees;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        Tree tree = new Tree();

        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);

//        tree.traversePreOrder();}

//        tree.traverseInOrder();

//        tree.traversePostOrder();

//        System.out.println(tree.height());

        System.out.println(tree);

        System.out.println(tree.min());

        System.out.println(tree.minBinarySearch());
    }
}
