package dev.deyve.algorithmsjava.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();

        integers.addFirst(10);
        integers.addLast(20);
        integers.addLast(30);

        System.out.println(integers.contains(10));
        System.out.println(integers.indexOf(10));
        System.out.println(integers);

        integers.reverse();
        System.out.println(integers);

        integers.removeFirst();
        integers.removeLast();
        System.out.println(integers);

    }
}
