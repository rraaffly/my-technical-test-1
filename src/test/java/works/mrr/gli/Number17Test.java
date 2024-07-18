package works.mrr.gli;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import works.mrr.gli.pojo.Animal;
import works.mrr.gli.pojo.Cat;
import works.mrr.gli.pojo.Cow;
import works.mrr.gli.pojo.Duck;

import static org.junit.jupiter.api.Assertions.*;

public class Number17Test {

    @Test
    @DisplayName("Test Cat Object")
    public void doTestCatObject() {
        Cat cat = new Cat();
        assertTrue(cat.isMammal());             // assertion to check is mammalian
        assertTrue(cat.isCarnivore());          // assertion to check is carnivore
    }

    @Test
    @DisplayName("Test Cow Object")
    public void doTestCowObject() {
        Cow cow = new Cow();
        assertTrue(cow.isMammal());              // assertion to check is mammalian
        assertFalse(cow.isCarnivore());          // assertion to check is carnivore
    }

    @Test
    @DisplayName("Test Duck Object")
    public void doTestDuckObject() {
        Duck duck = new Duck();
        assertFalse(duck.isMammal());             // assertion to check is mammalian
        assertFalse(duck.isCarnivore());          // assertion to check is carnivore
    }

    @Test
    @DisplayName("Test Animal Object")
    public void doTestAnimalObject() {
        Animal animal = new Animal();

        animal.setCarnivore(true);
        assertTrue(animal.isCarnivore());

        animal.setMammal(false);
        assertFalse(animal.isMammal());
    }
}
