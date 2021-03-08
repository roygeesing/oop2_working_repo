package oop2.module02.collectioncomparison;


import java.util.*;

public class CollectionComparison {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        Set<Person> personSet = new HashSet<>();
        Map<Integer, Person> personMap = new HashMap<>();

        Person p1 = new Person(1, "Marcel", "Gygli");
        Person p2 = new Person(2, "Savina", "Gygli");
        Person p3 = new Person(3, "Michael", "Wuersch");
        Person p4 = new Person(4, "Matthias", "Wuersch");
        Person p5 = new Person(5, "Dominik", "World");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);

        personMap.put(p1.getPersonNr(), p1);
        personMap.put(p2.getPersonNr(), p2);
        personMap.put(p3.getPersonNr(), p3);
        personMap.put(p4.getPersonNr(), p4);
        personMap.put(p5.getPersonNr(), p5);

        System.out.println("List Contents");
        for(Person person : personList){
            System.out.println(person);
        }
        System.out.println("-----------------------------");
        System.out.println("Set Contents");
        for(Person person : personSet){
            System.out.println(person);
        }
        System.out.println("-----------------------------");
        System.out.println("Map Contents");
        for(Person person : personMap.values()){
            System.out.println(person);
        }
    }
}
