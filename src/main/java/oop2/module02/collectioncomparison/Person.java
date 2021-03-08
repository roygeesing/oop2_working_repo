package oop2.module02.collectioncomparison;

import java.util.Objects;

public class Person {
    private int personNr;
    private String lastName;
    private String firstName;

    public Person(int personNr, String firstName, String lastName){
        this.personNr = personNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return this.personNr + " - " + this.firstName + " " + this.lastName;
    }

    public int getPersonNr(){
        return personNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personNr == person.personNr && Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personNr, lastName, firstName);
    }
}
