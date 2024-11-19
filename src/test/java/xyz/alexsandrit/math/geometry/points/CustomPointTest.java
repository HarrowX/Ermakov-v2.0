package xyz.alexsandrit.math.geometry.points;

import xyz.alexandrit.attributes.ColorAttribute;
import xyz.alexandrit.attributes.CoordinatesAttribute;
import xyz.alexandrit.attributes.TimeAttribute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.alexandrit.math.geometry.points.CustomPoint;

import java.util.List;

public class CustomPointTest {

    @Test
    void test_from_practise_book_1() {
        CustomPoint<Integer> point = new CustomPoint<>(List.of(3), new ColorAttribute("red"));
        Assertions.assertEquals("point: [3] is [color: red]", point.toString());
    }
    @Test
    void test_from_practise_book_2() {
        CustomPoint<Integer> point = new CustomPoint<>(List.of(4, 2, 5), new TimeAttribute(0, 0, 11));
        Assertions.assertEquals("point: [4, 2, 5] is [time: 11:00:00]", point.toString());
    }
    @Test
    void test_from_practise_book_3() {
        CustomPoint<Integer> point = new CustomPoint<>(List.of(7, 7), new ColorAttribute("yellow"),new TimeAttribute(0, 35, 15));
        Assertions.assertEquals("point: [7, 7] is [color: yellow, time: 15:35:00]", point.toString());
    }

    @Test
    void check_throws_with_duplicate_coordinates() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CustomPoint<Integer> point = new CustomPoint<>(List.of(1, 2), new CoordinatesAttribute<>(1, 2));
        });
    }
}
