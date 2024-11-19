package xyz.alexsandrit.attributes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.alexandrit.attributes.CoordinatesAttribute;

class CoordinatesAttributeTest {
    @Test
    void check_throws_from_null(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CoordinatesAttribute<Integer> cb = new CoordinatesAttribute<>(2, null);
        });
    }
    @Test
    void check_creation_coordinates_2D() {
        Assertions.assertEquals("coordinates: [2, 3]", new CoordinatesAttribute<>(2, 3).toString());
    }
    @Test
    void check_creation_coordinates_3D() {
        Assertions.assertEquals("coordinates: [2, 3, 4]", new CoordinatesAttribute<>(2, 3, 4).toString());
    }
}
