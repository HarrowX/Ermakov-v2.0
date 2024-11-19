package xyz.alexandrit.math.geometry.lines;

import xyz.alexandrit.math.geometry.points.AbstractPoint;

import java.util.List;

public class ClosedBrokenLine<T extends AbstractPoint<?>> extends BrokenLine<T> {
    @SafeVarargs
    public ClosedBrokenLine(T... points) {
        super(points);
    }

    public ClosedBrokenLine(List<T> points) {
        super(points);
    }

    public ClosedBrokenLine(BrokenLine<T> brokenLine) {
        super(brokenLine);
    }
    @Override
    protected List<T> correctPointsOfLines() {
        var  arr = super.correctPointsOfLines();
        arr.add(points.getFirst());
        return arr;
    }
    @Override
    public double length() {
        if (super.points.size() < 3) return super.length();
        return super.length() +
                super.points.getFirst().distanceTo(super.points.getLast());
    }
}
