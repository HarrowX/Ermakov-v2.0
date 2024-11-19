package xyz.alexandrit.math.geometry.figures;

import xyz.alexandrit.math.geometry.points.Point2D;

public class Circle extends Shape {
    private Point2D<Integer> point;
    private final Double radius;

    public Circle(Point2D<Integer> point, Double radius) {
        this.point = new Point2D<>(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
