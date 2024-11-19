package xyz.alexandrit.math.geometry.lines;

import xyz.alexandrit.math.geometry.points.AbstractPoint;
import xyz.alexandrit.math.geometry.points.Point3D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BrokenLine<T extends AbstractPoint<?>> implements Lenghtable {
    protected List<T> points = new ArrayList<>();

    public BrokenLine() {}
    @SafeVarargs
    public BrokenLine(T... points) {
        this(Arrays.stream(points).toList());
    }

    public BrokenLine(List<T> points) {
        this.points.addAll(points);
    }
    public BrokenLine(BrokenLine<T> line) {
        this.points.addAll(line.points);
    }

    public BrokenLine<T> addPoint(T point) {
        points.add(point);
        return this;
    }
    @SafeVarargs
    public final BrokenLine<T> addPoints(T... points) {
        this.points.addAll(List.of(points));
        return this;
    }
    public final BrokenLine<T> addPoints(BrokenLine<?> line) {
        return this.addPoints((T) line.points);
    }
    public BrokenLine<T> reverse() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine<?> that = (BrokenLine<?>) o;
        var points1 = correctPointsOfLines();
        var points2 = ((BrokenLine<?>) o).correctPointsOfLines();
        if (points2.size() != points1.size()) return false;
        if (points1.equals(points2)) return true;
        points1 = points1.reversed();
        return points1.equals(points2);
    }
    protected List<T> correctPointsOfLines() {
        return null;
    }
    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return STR."Line: \{points.toString()}";
    }

    @Override
    public double length() {
        int acc = 0;
        for (int i = 1; i < points.size(); i++) {
            acc += points.get(i).distanceTo(points.get(i-1));
        }
        return acc;
    }
}