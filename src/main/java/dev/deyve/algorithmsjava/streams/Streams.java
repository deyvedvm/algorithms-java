package dev.deyve.algorithmsjava.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8+ Streams
 */
public class Streams {

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
                .collect(Collectors.toList());
    }
}
