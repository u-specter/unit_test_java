import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;
    @BeforeEach
    public void createdCar(){
        car = new Car("Lamborghini", "01-Z-225-RB", 2025, "Umidjon Abdukhamidov");
    }


    @Test
    void getManufacturer() {
        assertEquals("Lamborghini", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("01-Z-225-RB", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("01-Z-222-RB");
        assertEquals("01-Z-222-RB", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2025, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Umidjon Abdukhamidov", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Behruz Abdukhamidov");
        assertEquals("Behruz Abdukhamidov", car.getOwner());
    }

    @Test
    void getListOfOwners(){
        assertArrayEquals(new String[]{"Umidjon Abdukhamidov"}, car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners(){
        car.setOwner("Behruz Abdukhamidov");
        assertArrayEquals(new String[]{"Umidjon Abdukhamidov", "Behruz Abdukhamidov"}, car.getOwners().toArray());
    }

    // тест для приватных классов
    @Test
    public void testPrivateMethod() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", null);
            method.setAccessible(true);
            assertEquals("abc", method.invoke(car).toString() );
        } catch (Exception e) {
            e.printStackTrace(); // показывает ошибки кода
        }
    }

    // с аргументом
    @Test
    public void testPrivateMethodWithArgument() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", String.class);
            method.setAccessible(true);
            assertEquals("abc", method.invoke(car, "abd").toString());
        } catch (Exception e) {
            e.printStackTrace(); // показывает ошибки кода
        }
    }
}