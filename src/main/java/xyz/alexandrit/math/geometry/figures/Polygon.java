package xyz.alexandrit.math.geometry.figures;

import xyz.alexandrit.math.geometry.lines.BrokenLine;

abstract public class Polygon extends Shape {
    private BrokenLine brokenLine;

    public Polygon(BrokenLine brokenLine) {
        this.brokenLine = new BrokenLine(brokenLine);
    }
}
