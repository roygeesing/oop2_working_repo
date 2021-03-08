package oop2.module03.cage;

import org.junit.jupiter.api.Test;

import oop2.module03.cage.animal.Bird;
import oop2.module03.cage.animal.Lion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Dieter Holz
 */
class CageTest {

//    @Test
//    void testInit(){
//
//        //when
//        Cage<Lion> c = new Cage<>();
//        Lion                l = new Lion();
//
//        //then
//        assertEquals(0, c.numberOfAnimals());
//        assertFalse(c.shelters(l));
//    }
//
//    @Test
//    void testJail(){
//        //given
//        Cage<Lion> c  = new Cage<>();
//        Lion                l1 = new Lion();
//        Lion                l2 = new Lion();
//
//        //when
//        c.jail(l1);
//        c.jail(l2);
//        c.jail(l2);
//
//        // c.jail(new Bird()); //Compile-Fehler, sehr gut.
//
//        //then
//        assertEquals(2, c.numberOfAnimals());
//        assertTrue(c.shelters(l1));
//        assertTrue(c.shelters(l2));
//    }
//
//    @Test
//    void testSetFree(){
//        //given
//        Cage<Lion> c  = new Cage<>();
//        Lion                l1 = new Lion();
//        Lion                l2 = new Lion();
//        c.jail(l1);
//        c.jail(l2);
//
//        //when
//        c.setFree(l1);
//        c.setFree(l2);
//
//        //then
//        assertEquals(0, c.numberOfAnimals());
//        assertFalse(c.shelters(l1));
//        assertFalse(c.shelters(l2));
//    }
//
//    @Test
//    void testJailAll(){
//        //given
//        Cage<Bird> c     = new Cage<>();
//        Bird                b1    = new Bird();
//        Bird                b2    = new Bird();
//        Bird[]              birds = {b1, b2};
//
//        //when
//        Cage.jailAll(c, birds);
//
//        //then
//        assertEquals(2, c.numberOfAnimals());
//        assertTrue(c.shelters(b1));
//        assertTrue(c.shelters(b2));
//    }

}