package xyz.alexandrit.math.geometry.points;

import lombok.EqualsAndHashCode;
import xyz.alexandrit.attributes.CoordinatesAttribute;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

abstract sealed public class AbstractPoint<T extends Number> implements Cloneable, Comparable<AbstractPoint<?>>
permits Point2D, Point3D, CustomPoint{
    protected CoordinatesAttribute<T> coordinates;
    @SafeVarargs
    protected AbstractPoint(T... values) {
        setCoordinates(values);
    }

    public Integer dimension() {
        return coordinates.getValues().size();
    }
    public List<T> getCoordinates() {
        return new ArrayList<>(coordinates.getValues());
    }
    @SafeVarargs
    public final void setCoordinates(T... values) {
        setCoordinates(Arrays.stream(values).toList());
    }

    public final void setCoordinates(List<T> values) {
        coordinates = new CoordinatesAttribute<>(values);
    }
    public T get(int index) {
        return coordinates.getValues().get(index);
    }

    @Override
    public String toString() {
        return STR."point: \{coordinates.getValues()}";
    }

    public abstract Object clone();
    public abstract Double distanceTo(AbstractPoint<?> other);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPoint<?> that = (AbstractPoint<?>) o;
        if (!dimension().equals(that.dimension())) return false;
        List<T> coordinatesThis = getCoordinates();
        List<?> coordinatesThat = that.getCoordinates();
        for (int i = 0; i < dimension(); i++) {
            if(!coordinatesThis.get(i).equals(coordinatesThat.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates);
    }

    @Override
    public int compareTo(@NonNull AbstractPoint<?> other) {
        return new ComparatorPoint().compare(this, other);
    }
}
