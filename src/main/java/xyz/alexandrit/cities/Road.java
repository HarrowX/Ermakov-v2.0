package xyz.alexandrit.cities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class Road {
    Town to;
    int cost;
    @Override
    public String toString() {
        return STR."road to \{to} costs \{cost}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return cost == road.cost && Objects.equals(to.name, road.to.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to.name, cost) ;
    }
}
