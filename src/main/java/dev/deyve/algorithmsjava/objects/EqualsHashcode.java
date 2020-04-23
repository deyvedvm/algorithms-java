package dev.deyve.algorithmsjava.objects;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashcode {

    public static void main(String[] args) {

        Player p1 = new Player(1, "Rafael Nadal");
        Player p2 = new Player(1, "Rafael Nadal");

        System.out.println(p1.equals(p2)); // false

        Set<Player> players = new HashSet<>();
        players.add(p1);
        players.add(p2);

        System.out.println("p1 hash code: " + p1.hashCode());
        System.out.println("p2 hash code: " + p2.hashCode());

        System.out.println("Set size: " + players.size());
        System.out.println("Set contains Rafael Nadal: " + players.contains(new Player(1, "Rafael Nadal"))); // false
    }

    public static class Player {

        private int id;
        private String name;

        public Player(int id, String name) {

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

            final Player other = (Player) obj;

            if (this.id != other.id) {
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

}
