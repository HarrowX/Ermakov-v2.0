package xyz.alexandrit.math.geometry.points;

import xyz.alexandrit.attributes.AbstractAttribute;
import xyz.alexandrit.attributes.CoordinatesAttribute;
import xyz.alexandrit.math.exception.DimensionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public non-sealed class CustomPoint<T extends Number> extends AbstractPoint<T> {
    private final List<AbstractAttribute<?>> attributes = new ArrayList<>();
    public CustomPoint(List<T> coordinates, AbstractAttribute<?>... values) {
        this(coordinates, Arrays.stream(values).toList());
    }
    public CustomPoint(List<T> coordinates, List<AbstractAttribute<?>> values) {
        values.forEach(this::checkAttribute);
        attributes.addAll(values);
        setCoordinates(coordinates);
    }
    private void checkAttribute(AbstractAttribute<?> attribute) {
        if (attribute == null)
            throw new IllegalArgumentException();
        if (attribute instanceof CoordinatesAttribute<?>)
            throw new IllegalArgumentException();
    }
    public void addAttribute(AbstractAttribute<?> attribute) {
        checkAttribute(attribute);
        attributes.add(attribute);
    }
    @Override
    public String toString() {
        return STR."\{super.toString()} is \{attributes}";
    }

    @Override
    public Object clone() {
        return new CustomPoint<>((List<T>) coordinates, attributes);
    }

    @Override
    public Double distanceTo(AbstractPoint<?> other) {
        return distanceTo((CustomPoint<T>) other);
    }


    public Double distanceTo(CustomPoint<T> other) {
        if (!this.dimension().equals(other.dimension()))
            throw new DimensionException("");
        List<Double> arraySumSquare = new ArrayList<>();
        for (int i = 0; i < this.dimension(); i++) {
            arraySumSquare.add((this.get(i).doubleValue()+ other.get(i).doubleValue())*(this.get(i).doubleValue()+ other.get(i).doubleValue()));
        }
        double sum = 0.;
        for (int i = 0; i < this.dimension(); i++) {
            sum += arraySumSquare.get(i);
        }
        return Math.sqrt(sum);
    }
}
