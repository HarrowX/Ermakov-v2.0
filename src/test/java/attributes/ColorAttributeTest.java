package attributes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ColorAttributeTest {
    @Test
    public void check_correct_init_color() {
        Assertions.assertEquals("color: red", new ColorAttribute("red").toString());
    }
    @Test
    public void check_correct_changed_color() {
        ColorAttribute color = new ColorAttribute("yellow");
        Assertions.assertEquals("color: yellow",color.toString());
        color.setValue("brown");
        Assertions.assertEquals("color: brown",color.toString());
    }
    @Test
    public void check_init_from_blank() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            ColorAttribute color = new ColorAttribute("      ");
        }, "");
    }
    @Test
    public void check_init_from_null() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            ColorAttribute color = new ColorAttribute(null);
        }, "");
    }
}
