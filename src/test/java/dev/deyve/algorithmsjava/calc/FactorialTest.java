package dev.deyve.algorithmsjava.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Factorial Test")
class FactorialTest {

    Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    @DisplayName("calc factorial of 5")
    void factorialOfFiveTest() {

        int result = factorial.calc(5);

        assertEquals(120, result);
    }

    @Test
    @DisplayName("calc factorial of 9")
    void factorialOfNineTest() {

        int result = factorial.calc(9);

        assertEquals(362880, result);
    }

    @Test
    @DisplayName("calc factorial with recursion of 5")
    void factorialOfFiveRecursionTest() {

        int result = factorial.calcRecursion(5);

        assertEquals(120, result);
    }

    @Test
    @DisplayName("calc factorial with recursion of 9")
    void factorialOfNineRecursionTest() {

        int result = factorial.calcRecursion(9);

        assertEquals(362880, result);
    }
}