package xyz.alexandrit.attributes;

public class ColorAttribute extends AbstractAttribute<String> {
    public ColorAttribute(String value) {
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
