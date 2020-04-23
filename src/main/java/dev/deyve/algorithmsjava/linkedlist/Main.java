package dev.deyve.algorithmsjava.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addLast(10);
        integers.addLast(20);
        integers.addLast(30);
        integers.addFirst(0);
//        System.out.println(integers.indexOf(10));
        System.out.println(integers);
    }
}
