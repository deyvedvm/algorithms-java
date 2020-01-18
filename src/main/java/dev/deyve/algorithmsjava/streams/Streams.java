package dev.deyve.algorithmsjava.streams;

import java.util.List;

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
}
