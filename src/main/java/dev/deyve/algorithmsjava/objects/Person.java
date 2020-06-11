package dev.deyve.algorithmsjava.objects;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Person {

    private final Integer id;

    private final String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Person other = (Person) obj;
        if (!this.id.equals(other.id)) {
            return false;
        }

        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);

        return hash;
    }
}
