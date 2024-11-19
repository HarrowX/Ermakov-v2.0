package xyz.alexandrit.attributes;

import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.List;


public class CoordinatesAttribute<T extends Number> extends AbstractAttribute<List<T>>{
    @SafeVarargs
    public CoordinatesAttribute(T... values) {
        this(Arrays.stream(values).toList());
    }
    public CoordinatesAttribute(List<T> values) {
        super(values);
    }

    public List<T> getValues() {
        return value;
    }
    @Override
    protected void checkValid(List<T> values) {
        values.forEach(this::checkValidElement);
    }
    private void checkValidElement(T value) {
        if (value == null)
            throw new IllegalArgumentException();
    }

    @Override
    public String name() {
        return "coordinates";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
