package attributes;

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
    public String toString() {
        return STR."\{name()}: \{value}";
    }
}
