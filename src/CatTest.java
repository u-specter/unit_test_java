import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void getCatNameMethod() {
        Cat cat = new Cat("Muska", 3);
        assertEquals("Muska", cat.getName());
    }

    @Test
    void testSetCatNameMethod() {
        Cat cat = new Cat("Muiza", 2);
        cat.setName("Tom");
        assertEquals("Tom", cat.getName());
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}