package dev.deyve.algorithmsjava.calc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfIntegers = getNumberOfIntegers(in);

        validatingNumberOfIntegers(numberOfIntegers);

        int[] arrayOfIntegers = getArrayOfIntegers(in);

        validatingLengthOfArray(numberOfIntegers, arrayOfIntegers);

        int lowerValue = Integer.MAX_VALUE;
        int highestValue = Integer.MIN_VALUE;
        for (int integer : arrayOfIntegers) {
            if (integer < lowerValue) {
                lowerValue = integer;
            }
            if (integer > highestValue) {
                highestValue = integer;
            }
        }

        int finalHighestValue = highestValue;
        int smallestSumOfIntegers = Arrays.stream(arrayOfIntegers).filter(i -> i != finalHighestValue).sum();

        int finalLowerValue = lowerValue;
        int highestSumOfIntegers = Arrays.stream(arrayOfIntegers).filter(i -> i != finalLowerValue).sum();

        System.out.println(smallestSumOfIntegers + " " + highestSumOfIntegers);
    }

    private static void validatingNumberOfIntegers(int numberOfIntegers) {
        if (numberOfIntegers < 2 || numberOfIntegers > 10) {
            throw new IllegalArgumentException("N should be between 2 and 10");
        }
    }

    private static void validatingLengthOfArray(int numberOfIntegers, int[] arrayOfIntegers) {
        if (arrayOfIntegers.length != numberOfIntegers) {
            throw new IllegalArgumentException("Number of numbers and length of array should be the same");
        }
    }

    private static int getNumberOfIntegers(Scanner in) {
        String numberOfIntegersString = in.nextLine();

        return Integer.parseInt(numberOfIntegersString);
    }

    private static int[] getArrayOfIntegers(Scanner in) {
        String[] arrayOfNumbersString = in.nextLine().split(" ");

        return Arrays.stream(arrayOfNumbersString).mapToInt(Integer::parseInt).toArray();
    }
}
