package xyz.alexsandrit.math.ariphmetic;

import xyz.alexandrit.math.ariphmetic.Summator;
import xyz.alexandrit.math.numbers.Fractions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummatorTest {
    double delta = 0.0001;
    @Test
    void first_example_from_practise_book() {
        Assertions.assertEquals(4.9,
                Summator.of(2, new Fractions(3, 5),2.3), delta);
    }
    @Test
    void second_example_from_practise_book() {
        Assertions.assertEquals(12.1833,
                Summator.of(3.6, new Fractions(49, 12), 3, new Fractions(3, 2)), delta);
    }
    @Test
    void third_example_from_practise_book() {
        Assertions.assertEquals(1.3333, Summator.of(new Fractions(1, 3), 1),delta);
    }
    @Test
    void from_strings() {
        Assertions.assertEquals(1.3333, Summator.of(new Fractions(1, 3), 1),delta);
    }
}
