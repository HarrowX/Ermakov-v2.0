package xyz.alexandrit.math.ariphmetic;

import xyz.alexandrit.birds.Bird;
import xyz.alexandrit.cats.Meowable;
import xyz.alexandrit.math.geometry.figures.Shape;
import xyz.alexandrit.math.geometry.lines.BrokenLine;
import xyz.alexandrit.math.geometry.lines.Lenghtable;

import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.stream.Stream;

public class Summator {
    public static double of(Number... numbers) {
        double sum = 0.;
        for (var number : numbers)
            sum += number.doubleValue();
        return sum;
    }
    public static double ofStringInt(String... strings) {
        Integer[] numbers =  new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = parseInt(strings[i]);
        }
        return of(numbers);
    }
    public static void sayMeow(Meowable... animals) {
        Arrays.stream(animals).toList().forEach(Meowable::meow);
    }
    public static void singMany(Bird... birds) {
        Arrays.stream(birds).toList().forEach(Bird::sing);
    }

    public static double of(Shape... shapes) {
        double sum = 0.;
        for (var shape : shapes)
            sum += shape.area();
        return sum;
    }
    public static double of(Lenghtable... lines) {
        double sum = 0.;
        for (var line : lines)
            sum += line.length();
        return sum;
    }
    @SafeVarargs
    public static BrokenLine<?> of (BrokenLine<?>... lines) {
        BrokenLine<?> outputLine = new BrokenLine<>();
        Stream.of(lines).forEach(outputLine::addPoints);
        return outputLine;
    }
}
