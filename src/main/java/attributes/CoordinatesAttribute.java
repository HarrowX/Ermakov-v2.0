package attributes;

import java.util.ArrayList;
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
        return null;
    }
}
