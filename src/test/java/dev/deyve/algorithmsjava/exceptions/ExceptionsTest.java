package dev.deyve.algorithmsjava.exceptions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static dev.deyve.algorithmsjava.exceptions.Exceptions.requireNonNullElseThrow;
import static dev.deyve.algorithmsjava.exceptions.Exceptions.requireNotNullElseThrow;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Check object and throws IllegalArgumentException exception ; receives the object and supplier ; throws IllegalArgumentException")
    void requireNonNullElseThrowIAETest() {

        Object nullObject = null;

        Supplier<IllegalArgumentException> exceptionSupplier = () -> new IllegalArgumentException("Object cannot be null");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> requireNotNullElseThrow(nullObject, exceptionSupplier));

        Class<? extends Exception> clazz = exception.getClass();

        assertSame(clazz, IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Check object and return a object ; receives the object and supplier ; return object")
    void requireNonNullElseNotThrowIAETest() {

        Object carObject = new Car("Urus", "Black", 2020);

        Supplier<IllegalArgumentException> exceptionSupplier = () -> new IllegalArgumentException("Object cannot be null");

        Object result = requireNotNullElseThrow(carObject, exceptionSupplier);

        assertSame(result.getClass(), Car.class);
    }

    @Test
    @DisplayName("Check object and throws generic exception ; receives the object and exception ; throws exception")
    void requireNonNullElseThrowTest() {

        Object nullObject = null;

        UnsupportedOperationException mockException = new UnsupportedOperationException();

        Exception exception = assertThrows(UnsupportedOperationException.class, () -> requireNonNullElseThrow(nullObject, mockException));

        Class<? extends Exception> clazz = exception.getClass();

        assertSame(clazz, mockException.getClass());
    }

    @Test
    @DisplayName("Check object and return a object ; receives the object and exception ; return object")
    void requireNonNullElseNotThrowTest() {

        Object carObject = new Car("Urus", "Black", 2020);

        UnsupportedOperationException mockException = new UnsupportedOperationException();

        Object result = requireNonNullElseThrow(carObject, mockException);

        assertSame(result.getClass(), Car.class);
    }
}