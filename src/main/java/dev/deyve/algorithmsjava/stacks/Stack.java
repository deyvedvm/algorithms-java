package dev.deyve.algorithmsjava.stacks;

import dev.deyve.algorithmsjava.vectors.Vector;

public class Stack<T> extends Vector {

    private T[] elements;
    private int size;

    public Stack(int size) {
        super(size);
    }

}
