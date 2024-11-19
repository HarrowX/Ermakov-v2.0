package xyz.alexandrit.math.geometry.figures;

import xyz.alexandrit.math.geometry.lines.BrokenLine;

public class Triangle extends Polygon{
    public Triangle(BrokenLine brokenLine) {
        super(brokenLine);
    }

    @Override
    public double area() {
        return 0;
    }
}
