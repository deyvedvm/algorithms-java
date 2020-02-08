package dev.deyve.algorithmsjava.exceptions;

import java.util.Optional;
import java.util.function.Supplier;

public class Exceptions {

    /**
     * Check object and throws IllegalArgumentException exception
     *
     * @param obj             Object to check
     * @param messageSupplier Supplier Message
     * @param <T>             T Object
     * @return T Object
     */
    public static <T> T requireNonNullElseThrowIAE(T obj, Supplier<String> messageSupplier) {

        if (obj == null) {
            throw new IllegalArgumentException(Optional.ofNullable(messageSupplier)
                    .map(Supplier::get)
                    .orElse(null));
        }

        return obj;
    }

    /**
     * Check object and throws generic exception
     *
     * @param obj       Object to check
     * @param exception Exception to throw
     * @param <T>       T  Object
     * @param <X>       X Exception
     * @return T Object
     * @throws X Generic Exception
     */
    public static <T, X extends Throwable> T requireNonNullElseThrow(T obj, X exception) throws X {

        if (obj == null) {
            throw exception;
        }

        return obj;
    }

}
