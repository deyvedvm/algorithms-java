package dev.deyve.algorithmsjava.linkedlist;

public class LinkedList<T> {

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void addFirst(T item) {
        Node<T> node = new Node<>(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(T item) {
        Node<T> node = new Node<>(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
}
