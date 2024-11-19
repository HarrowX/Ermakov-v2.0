package xyz.alexandrit.attributes;

import java.util.Objects;

public abstract class AbstractAttribute<T> {

    protected T value;

    protected AbstractAttribute(T value) {
        setValue(value);
    }

    public void setValue(T value) {
        checkValid(value);
        this.value = value;
    }

    protected abstract void checkValid(T value);
    public abstract String name();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAttribute<?> that = (AbstractAttribute<?>) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return STR."\{name()}: \{value}";
    }
}
