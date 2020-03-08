package dev.deyve.algorithmsjava.vectors;

import lombok.Getter;

import java.util.stream.IntStream;

/**
 * Vector
 */
public class Vector<T> {

    @Getter
    private Integer size;

    @Getter
    private T[] elements;

    protected Vector(int capacity) {

        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * Add Elemnent do Vector
     *
     * @param element T
     * @return Boolean
     */
    Boolean add(T element) {

        this.increasesCapacity();

        if (this.size < this.elements.length) {

            this.elements[this.size++] = element;
            return true;

        } else {
            return false;
        }
    }

    /**
     * Add Elemnent do Vector with position
     *
     * @param position int
     * @param element  T
     * @return boolean
     */
    boolean add(int position, T element) {

        validateVectorSize(position);

        this.increasesCapacity();

        /*for (int i = this.size - 1; i >= position; i--) {

            this.elements[i + 1] = this.elements[i];
        }*/

        if (this.size - position >= 0)
            System.arraycopy(this.elements, position, this.elements, position + 1, this.size - position);

        this.elements[position] = element;

        this.size++;

        return true;
    }

    /**
     * Find one Element by positon
     *
     * @param position int
     * @return T
     */
    T find(int position) {

        validateVectorSize(position);

        return this.elements[position];
    }

    /**
     * Find one Element
     *
     * @param element T
     * @return int
     */
    int find(T element) {

        for (int i = 0; i < this.size; i++) {

            if (this.elements[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Find Last Index
     *
     * @param element T
     * @return int
     */
    int lastIndex(T element) {

        for (int i = this.size - 1; i >= 0; i--) {

            if (this.elements[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Check if contains one element
     *
     * @param element T
     * @return boolean
     */
    boolean contains(T element) {

        return find(element) >= 0;
    }

    /**
     * Remove Element from position
     *
     * @param position int
     */
    void remove(int position) {

        validateVectorSize(position);

        /*for (int i = position; i < this.size - 1; i++) {

            this.elements[i] = this.elements[i + 1];
        }*/

        if (this.size - 1 - position >= 0)
            System.arraycopy(this.elements, position + 1, this.elements, position, this.size - 1 - position);

        this.size--;
    }

    /**
     * Remove Element
     *
     * @param element T
     */
    void remove(T element) {

        int position = this.find(element);

        if (position > -1) {

            this.remove(position);

        }
    }

    /**
     * Clear vector
     */
    void clear() {

        IntStream.range(0, this.size)
                .forEach(i -> this.elements[i] = null);

        this.size = 0;
    }

    /**
     * Return size of Vector
     *
     * @return Integer
     */
    Integer size() {

        return this.size;
    }

    /**
     * Validate Vector Size
     *
     * @param position int
     */
    private void validateVectorSize(int position) {

        if (!(position >= 0 && position < size)) {

            throw new IllegalArgumentException("Invalid position");
        }
    }

    /**
     * Increases Capacity
     */
    private void increasesCapacity() {

        if (this.size == this.elements.length) {

            T[] newElements = (T[]) new Object[this.elements.length * 2];

            System.arraycopy(this.elements, 0, newElements, 0, this.size);

            this.elements = newElements;
        }

    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            stringBuilder.append(this.elements[i]);
            stringBuilder.append(", ");
        }

        if (this.size > 0) {
            stringBuilder.append(this.elements[this.size - 1]);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();

    }

}
