package dev.deyve.algorithmsjava.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void addFirst(T item) {
        var node = new Node<>(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public void addLast(T item) {
        var node = new Node<>(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public int indexOf(T item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value.equals(item)) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            last = getPrevious(last);
            last.next = null;
        }

        size--;
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node<T> getPrevious(Node<T> node) {
        var current = first;

        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size];

        var current = first;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }

        var previous = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public T getKthFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        var a = first;
        var b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;

            if (b == null) {
                throw new IllegalArgumentException();
            }
        }

        while (b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        Node<T> current = first;

        while (current != null) {
            stringBuilder.append(current.value).append(" -> ");
            current = current.next;
        }

        stringBuilder.append("null");

        return stringBuilder.toString();
    }

}
