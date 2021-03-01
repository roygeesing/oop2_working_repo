package oop2.module02.list;

import oop2.module02.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dieter Holz
 */
public class Family {
    private final List<Person> members;

    public Family() {
        members = new ArrayList<>();
    }

    public int size() {
        return members.size();
    }

    public void add(Person person) {
        if (!isMember(person)) {
            members.add(person);
        }
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
