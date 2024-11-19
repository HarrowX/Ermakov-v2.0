package xyz.alexsandrit.math.geometry.lines;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.alexandrit.math.geometry.lines.Line;
import xyz.alexandrit.math.geometry.points.AbstractPoint;
import xyz.alexandrit.math.geometry.points.Point2D;

public class LineTest {
    @Test
    void check_equals_hash() {
        Point2D<?> p1 = new Point2D<>(1, 2);
        Point2D<?> p2 = new Point2D<>(1, 2);
        Line<?> line1 = new Line<>(p1, p2);
        Line<?> line2 = new Line<>(p2, p1);
        Assertions.assertEquals(line1.hashCode(), line2.hashCode());
    }
}
