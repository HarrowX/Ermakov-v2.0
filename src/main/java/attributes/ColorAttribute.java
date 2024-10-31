package attributes;

public class ColorAttribute extends AbstractAttribute<String> {
    protected ColorAttribute(String value) {
        super(value);
    }

    @Override
    protected void checkValid(String value) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException();
    }
    @Override
    public String name() {
        return "color";
    }
}
