import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog;

    @BeforeEach
    void prepareData(){
        dog = new Dog("Reks", 3);
    }

    @org.junit.jupiter.api.Test
    void getDogNameMethod() {
        assertEquals("Reks", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethod() {
        dog.setName("Mishka");
        assertEquals("Reks", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 3);
        dog.setName("Mishka");
        assertEquals("Mishka", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @Test
    void getName() {
    }

    @Test
    void testSetName() {
    }

    @Test
    void testGetAge() {
    }

    @Test
    void testSetAge() {
    }
}