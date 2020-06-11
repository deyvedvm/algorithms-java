package dev.deyve.algorithmsjava.objects;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Person person = new Person(1, "Senna");
        Person samePerson = new Person(1, "Senna");

//        System.out.println("Person: " + person + " HashCode: " + person.hashCode());
//        System.out.println("Person: " + samePerson + " HashCode: " + samePerson.hashCode());

//        System.out.println("Are Equals?: " + person.equals(samePerson));

        Set<Person> persons = new HashSet<>();
        persons.add(person);
        persons.add(samePerson);

        System.out.println("Person: " + person + " HashCode: " + person.hashCode());
        System.out.println("Person: " + samePerson + " HashCode: " + samePerson.hashCode());
        System.out.println("Set size: " + persons.size());
        System.out.println("Set contains: Senna: " + persons.contains(new Person(1, "Senna")));
    }
}
