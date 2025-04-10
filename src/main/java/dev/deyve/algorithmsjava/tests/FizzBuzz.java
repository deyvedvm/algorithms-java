package dev.deyve.algorithmsjava.tests;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100)
                .mapToObj(number -> number % 5 == 0 ? (number % 7 == 0 ? "FizzBuzz" : "Fizz") : (number % 7 == 0 ? "Buzz" : number))
                .forEach(System.out::println);

    }

    public static void fizzBuzz(int n) {
        IntStream.rangeClosed(1, n)
                .mapToObj(number -> number % 3 == 0 ? (number % 5 == 0 ? "FizzBuzz" : "Fizz") : (number % 5 == 0 ? "Buzz" : number))
                .forEach(System.out::println);
    }

}
