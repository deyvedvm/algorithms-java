package dev.deyve.algorithmsjava.calc;

public class Factorial {

    int calc(int number) {
        // Using Reduce
        // return IntStream.iterate(number, index -> index > 1, index -> index - 1).reduce(1, (a, b) -> a * b);

        var factorial = 1;

        for (int index = number; index > 1; index--) {
            factorial *= index;
        }

        return factorial;
    }

    int calcRecursion(int number) {
        // Base condition
        if (number == 0) return 1;

        return number * calcRecursion(number - 1);
    }
}
