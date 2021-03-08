package oop2.module03.cage;

import java.util.HashSet;
import java.util.Set;

import oop2.module03.cage.animal.Animal;

/**
 * @author Dieter Holz
 */
public class Cage_ExtendedSolution<T extends Animal> {

    private Set<T> animals = new HashSet<>();

    public int numberOfAnimals() {
        return animals.size();
    }

    public boolean shelters(T animal) {
        return animals.contains(animal);
    }

    public void jail(T animal) {
        animals.add(animal);
    }

    public void setFree(T animal) {
        animals.remove(animal);
    }

    public static <A extends Animal> void jailAll(Cage_ExtendedSolution<A> cage, A[] allAnimals) {
        for(A animal : allAnimals){
            cage.jail(animal);
        }

    }
}
