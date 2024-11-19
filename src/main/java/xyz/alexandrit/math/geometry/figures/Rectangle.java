package xyz.alexandrit.math.geometry.figures;

import xyz.alexandrit.math.geometry.lines.BrokenLine;

public class Rectangle extends Polygon {



    public Rectangle(BrokenLine brokenLine) {
        super(brokenLine);
    }

    @Override
    public double area() {
        return 0;
    }
}
