package oop2.module02.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import oop2.module02.Person;

/**
 * @author Dieter Holz
 */
public class Family {

    private final Set<Person> members = new HashSet<>();
    private final Map<Integer, Set<Person>> membersByAge;

    public Family() {
        membersByAge = new HashMap<>();
    }

    public int size() {
        return members.size();
    }

    public void add(Person person) {
        members.add(person);

        if (!membersByAge.containsKey(person.getAge())) {
            membersByAge.put(person.getAge(), new HashSet<>());
        }
        membersByAge.get(person.getAge()).add(person);
    }

    public Person getOldest() {
        Person oldest = null;
        for (Person p : members) {
            if (oldest == null || p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest;
    }

    public boolean isMember(Person person) {
        return members.contains(person);
    }

    public int numberOfMembers(int age) {
        Optional<Set<Person>> membersForAge = Optional.ofNullable(membersByAge.get(age));
        return membersForAge.map(Set::size).orElse(0);
    }

    public Set<Integer> allAges() {
        return membersByAge.keySet();
    }
}
