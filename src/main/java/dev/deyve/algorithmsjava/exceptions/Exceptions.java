package dev.deyve.algorithmsjava.exceptions;

import java.util.function.Supplier;

public class Exceptions {

    /**
     * Check object and throws generic exception using Supplier
     *
     * @param obj               Object to check
     * @param exceptionSupplier Supplier Message
     * @param <T>               T Object
     * @return T Object
     */
    public static <T, X extends Throwable> T requireNotNullElseThrow(T obj, Supplier<? extends X> exceptionSupplier) throws X {

        if (obj != null) {
            return obj;
        } else {
            throw exceptionSupplier.get();
        }
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
