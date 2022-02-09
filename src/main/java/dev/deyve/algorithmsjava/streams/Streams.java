package dev.deyve.algorithmsjava.streams;

import java.util.List;
import java.util.function.Predicate;

/**
 * Java 8+ Streams
 */
public class Streams {

    Streams() {
    }

    /**
     * Sum values from Object
     *
     * @param users List of Users
     * @return Sum
     */
    static Integer sumValuesFromObject(List<User> users) {

        return users
                .stream()
                .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
    }

    /**
     * Filter String List
     *
     * @param stringList String List
     * @param str        String
     * @return String
     */
    static List<String> filterStringList(List<String> stringList, String str) {

        return stringList
                .stream()
                .filter(string -> string.startsWith(str))
                .toList();
    }

    /**
     * Filter Strings with Predicate
     *
     * @param stringList List of Strings
     * @param predicate  Predicate
     * @return Strings filtered
     */
    static List<String> filterStringsWithPredicate(List<String> stringList, Predicate<String> predicate) {

        return stringList
                .stream()
                .filter(predicate)
                .toList();
    }
}
