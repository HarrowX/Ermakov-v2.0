package xyz.alexsandrit.cities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.alexandrit.cities.Town;
import xyz.alexandrit.cities.Town2Sides;

public class CitiesTest {
    @Test
    void check_equals_town() {
        Town moscow = new Town("Moscow");
        Town peters = new Town("Peters");
        moscow.putRoad(peters, 1000);

        Town moscow2 = new Town("Moscow");
        Town peters2 = new Town("Peters");
        moscow2.putRoad(peters2, 1000);
        Assertions.assertEquals(moscow, moscow2);
        Assertions.assertEquals(moscow2, moscow);
        Assertions.assertEquals(peters, peters2);
        Assertions.assertEquals(peters2, peters);
        Assertions.assertEquals(moscow.hashCode(), moscow2.hashCode());
        Assertions.assertEquals(peters.hashCode(), peters2.hashCode());
    }

    @Test
    void check_equals_town_2() {
        Town moscow = new Town("Moscow");
        Town peters = new Town("Peters");
        moscow.putRoad(peters, 1000);

        Town moscow2 = new Town("Moscow");
        moscow2.putRoad(peters, 1000);

        Assertions.assertEquals(moscow, moscow2);
        Assertions.assertEquals(moscow2, moscow);
        Assertions.assertEquals(moscow.hashCode(), moscow2.hashCode());
    }

    @Test
    void check_not_equals_town_2() {
        Town moscow = new Town("Moscow");
        Town peters = new Town("Peters");
        Town saratov = new Town("Saratov");

        moscow.putRoad(peters, 1000);
        moscow.putRoad(saratov, 1000);

        Town moscow2 = new Town("Moscow");
        moscow2.putRoad(peters, 1000);

        Assertions.assertNotEquals(moscow, moscow2);
        Assertions.assertNotEquals(moscow2, moscow);
    }
    @Test
    void check_not_equals_town() {
        Town moscow = new Town("Moscow");
        Town peters = new Town("Peters");
        moscow.putRoad(peters, 1000);

        Town moscow2 = new Town("Moscow");
        Town peters2 = new Town("Peters");
        moscow2.putRoad(peters2, 20);

        Assertions.assertNotEquals(moscow, moscow2);
        Assertions.assertNotEquals(moscow2, moscow);
    }

    @Test
    void check_equals_town_2_sides() {
        Town moscow = new Town2Sides("Moscow");
        Town peters = new Town2Sides("Peters");
        moscow.putRoad(peters, 1000);

        Town moscow2 = new Town2Sides("Moscow");
        Town peters2 = new Town2Sides("Peters");
        moscow2.putRoad(peters2, 1000);

        Assertions.assertEquals(moscow, moscow2);
        Assertions.assertEquals(moscow2, moscow);
        Assertions.assertEquals(peters, peters2);
        Assertions.assertEquals(peters2, peters);
        Assertions.assertEquals(moscow.hashCode(), moscow2.hashCode());
        Assertions.assertEquals(peters.hashCode(), peters2.hashCode());
    }

    @Test
    void check_not_equals_town_2_sides() {
        Town moscow = new Town2Sides("Moscow");
        Town peters = new Town2Sides("Peters");
        moscow.putRoad(peters, 1000);

        Town moscow2 = new Town2Sides("Moscow");
        Town peters2 = new Town2Sides("Peters");
        moscow2.putRoad(peters2, 30);

        Assertions.assertNotEquals(moscow, moscow2);
        Assertions.assertNotEquals(moscow2, moscow);
        Assertions.assertNotEquals(peters, peters2);
        Assertions.assertNotEquals(peters2, peters);
    }

    @Test
    void check_equals_town_2_sides_and_simple_town() {
        Town moscow = new Town("Moscow");
        Town peters = new Town("Peters");
        moscow.putRoad(peters, 1000);
        peters.putRoad(moscow, 1000);

        Town moscow2 = new Town2Sides("Moscow");
        Town peters2 = new Town2Sides("Peters");
        moscow2.putRoad(peters2, 1000);
        Assertions.assertEquals(moscow, moscow2);
        Assertions.assertEquals(moscow2, moscow);
        Assertions.assertEquals(peters, peters2);
        Assertions.assertEquals(peters2, peters);
        Assertions.assertEquals(moscow.hashCode(), moscow2.hashCode());
        Assertions.assertEquals(peters.hashCode(), peters2.hashCode());
    }

    @Test
    void check_not_equals_town_2_sides_and_simple_town() {
        Town moscow = new Town("Moscow");
        Town peters = new Town("Peters");
        moscow.putRoad(peters, 1000);

        Town moscow2 = new Town2Sides("Moscow");
        Town peters2 = new Town2Sides("Peters");
        moscow2.putRoad(peters2, 1000);

        Assertions.assertNotEquals(moscow, moscow2);
        Assertions.assertNotEquals(moscow2, moscow);
        Assertions.assertNotEquals(peters, peters2);
        Assertions.assertNotEquals(peters2, peters);
    }

}
