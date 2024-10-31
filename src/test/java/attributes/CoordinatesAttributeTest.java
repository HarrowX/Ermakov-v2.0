package attributes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordinatesAttributeTest {
    @Test
    void check_throws_from_null(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CoordinatesAttribute<Integer> cb = new CoordinatesAttribute<>(2, null);
        });
    }

}
