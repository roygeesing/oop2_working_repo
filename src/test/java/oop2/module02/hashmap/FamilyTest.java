package oop2.module02.hashmap;

import org.junit.jupiter.api.Test;

import oop2.module02.Person;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Dieter Holz
 */
class FamilyTest {

	@Test
	void testNumberOfMembers() {
		//given
		Family family  = new Family();
		Person personA = new Person(30, 50, 1.70);
		Person personB = new Person(35, 45, 1.60);
		Person personC = new Person(35, 40, 1.80);
		family.add(personA);
		family.add(personB);
		family.add(personC);

		//when
		int count20 = family.numberOfMembers(20);
		int count35 = family.numberOfMembers(35);
		int count30 = family.numberOfMembers(30);

		//then
		assertEquals(0, count20);
		assertEquals(2, count35);
		assertEquals(1, count30);
	}

	@Test
	public void testAllAges() {
		//given
		Family          family  = new Family();
		Person personA = new Person(30, 50, 1.70);
		Person personB = new Person(35, 45, 1.60);
		Person personC = new Person(35, 40, 1.80);
		family.add(personA);
		family.add(personB);
		family.add(personC);

		//when
		Set<Integer> ages = family.allAges();

		//then
		assertEquals(2, ages.size());
		assertTrue(ages.contains(30));
		assertTrue(ages.contains(35));
	}

}
