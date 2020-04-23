package dev.deyve.algorithmsjava.arrays;

import java.util.Arrays;

public class Array {

    private int count;

    private int[] items;

    public Array(int length) {
        this.items = new int[length];
    }

    public void print() {

        Arrays.stream(items, 0, count).forEach(System.out::println);
    }

    public void insert(int item) {
        if (items.length == count) {

            int[] newItems = new int[count * 2];

            System.arraycopy(items, 0, newItems, 0, count);

            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        System.arraycopy(this.items, index + 1, this.items, index, count - index);

        count--;
    }

    public int indexOf(int item) {

        for (int index = 0; index < count; index++) {
            if (items[index] == item) {
                return index;
            }
        }

        return -1;
    }
}
