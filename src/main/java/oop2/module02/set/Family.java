package oop2.module02.set;

import oop2.module02.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dieter Holz
 */
public class Family {
    private final Set<Person> members;

    public Family() {
        members = new HashSet<>();
    }

    public int size() {
        return members.size();
    }

    public void add(Person person) {
        members.add(person);
    }

    public boolean isMember(Person person) {
        return members.contains(person);
    }

    public Person getOldest() {
        return members.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}
