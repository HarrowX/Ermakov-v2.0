package xyz.alexsandrit.attributes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.alexandrit.attributes.TimeAttribute;

class TimeAttributeTest {
    @Test
    void from_exercise_book_1() {
        var result = new TimeAttribute(10000);
        Assertions.assertEquals("time is 2:46:40", result.toString());
    }
    @Test
    void from_exercise_book_2() {
        var result = new TimeAttribute(5, 3, 2);
        Assertions.assertEquals("time is 2:03:05", result.toString());
    }
    @Test
    void check_zero_field() {
        var result = new TimeAttribute(0);
        Assertions.assertEquals("time is 0:00:00", result.toString());
    }
    @Test
    void check_zero_with_86400() {
        var result = new TimeAttribute(86400);
        Assertions.assertEquals("time is 0:00:00", result.toString());
    }

}
