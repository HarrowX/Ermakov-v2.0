package xyz.alexsandrit.math.geometry.points;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.alexandrit.math.geometry.points.Point2D;

public class Point2DTest {
    @Test
    void check_equals_hash() {
        Point2D<?> p1 = new Point2D<>(1, 2);
        Point2D<?> p2 = new Point2D<>(1, 2);
        Assertions.assertEquals(p1.hashCode(), p2.hashCode());
    }
}
