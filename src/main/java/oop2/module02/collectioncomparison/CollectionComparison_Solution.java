package oop2.module02.collectioncomparison;

import java.util.*;

public class CollectionComparison_Solution {

    public static void main(String[] args) {

        // Create 5 Person instances
        Person p1 = new Person(1, "Marcel", "Gygli");
        Person p2 = new Person(2, "Savina", "Gygli");
        Person p3 = new Person(3, "Michael", "Wuersch");
        Person p4 = new Person(4, "Matthias", "Wuersch");
        Person p5 = new Person(5, "Dominik", "World");


        // Create 3 data structers (List, Set, Map)
        List<Person> personList = new LinkedList<>();
        Set<Person> personSet = new HashSet<>();
        Map<Integer, Person> personMap = new HashMap<>();

        // Add persons to List
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        // Add persons to Set
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);

        // Add persons to Map
        personMap.put(p1.hashCode(),p1);
        personMap.put(p2.hashCode(),p2);
        personMap.put(p3.hashCode(),p3);
        personMap.put(p4.hashCode(),p4);
        personMap.put(p5.hashCode(),p5);


        System.out.println("List Contents");
        // Iterate over List
        for(Person person : personList){
            System.out.println(person);
        }

        System.out.println("------------------------------");
        System.out.println("Set Contents");
        // Iterate over the Set
        for(Person person : personSet){
            System.out.println(person);
        }

        System.out.println("------------------------------");
        System.out.println("Map Contents");
        // Iterate over the Map
        for(Person person : personMap.values()){
            System.out.println(person);
        }

        /*
        for(Integer i : personMap.keySet()){
            System.out.println(personMap.get(i));
        }

        for(Map.Entry<Integer,Person> entry : personMap.entrySet()){
            System.out.println(entry.getValue());
        }*/



    }

}
