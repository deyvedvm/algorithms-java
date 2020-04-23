package dev.deyve.algorithmsjava.objects;

public class Main {

    public static void main(String[] args) {

        Person person = new Person(1, "Deyve");
        Person samePerson = new Person(1, "Deyve");

        System.out.println(person);
        System.out.println("HashCode: " + person.hashCode());
        System.out.println(samePerson);
        System.out.println("HashCode: " + samePerson.hashCode());

        System.out.println(person.equals(samePerson));
    }
}
