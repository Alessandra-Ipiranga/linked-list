package de.neuefische.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


class AnimalListTest {

    @Test
    public void toStringOfEmptyListReturnsEmptyString(){
        // GIVEN
        AnimalList list = new AnimalList();

        // WHEN
        String actual = list.toString();

        // THEN
        assertEquals("", actual);
    }

    @Test
    public void testAddToList(){
        // GIVEN
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal mouse = new Animal("mouse");
        AnimalList list = new AnimalList();

        // WHEN
        list.add(dog);
        list.add(cat);
        list.add(mouse);
        String actual = list.toString();

        // THEN
        String expected = "dog -> cat -> mouse";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFirst(){
        // GIVEN
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal mouse = new Animal("mouse");
        Animal elefant = new Animal("elefant");
        Animal rabbit = new Animal("rabbit");
        Animal tiger = new Animal("tiger");
        AnimalList list = new AnimalList();

        // WHEN
        list.add(dog);
        list.add(cat);
        list.add(mouse);
        list.add(elefant);
        list.add(rabbit);
        list.add(tiger);
        list.removeFirst(dog);
        String actual = list.toString();

        // THEN
        String expected = "cat -> mouse -> elefant -> rabbit -> tiger";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveLast(){
        // GIVEN
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal mouse = new Animal("mouse");
        Animal elefant = new Animal("elefant");
        Animal rabbit = new Animal("rabbit");
        Animal tiger = new Animal("tiger");
        AnimalList list = new AnimalList();

        // WHEN
        list.add(dog);
        list.add(cat);
        list.add(mouse);
        list.add(elefant);
        list.add(rabbit);
        list.add(tiger);
        list.removeLast(mouse);
        String actual = list.toString();

        // THEN
        String expected = "dog -> cat -> mouse -> elefant -> rabbit";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveMiddle(){
        // GIVEN
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal mouse = new Animal("mouse");
        Animal elefant = new Animal("elefant");
        Animal rabbit = new Animal("rabbit");
        Animal tiger = new Animal("tiger");
        AnimalList list = new AnimalList();

        // WHEN
        list.add(dog);
        list.add(cat);
        list.add(mouse);
        list.add(elefant);
        list.add(rabbit);
        list.add(tiger);
        list.removeMiddle(elefant);
        String actual = list.toString();

        // THEN
        String expected = "dog -> cat -> mouse -> rabbit -> tiger";
        assertEquals(expected, actual);
    }

}