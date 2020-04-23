package dev.deyve.algorithmsjava.arrays;

public class Main {

    public static void main(String[] args) {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(0);
        numbers.print();
        System.out.println(numbers.indexOf(20));
    }
}
