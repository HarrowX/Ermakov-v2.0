package xyz.alexandrit.math.geometry.lines;

import lombok.EqualsAndHashCode;
import xyz.alexandrit.math.geometry.points.AbstractPoint;

import java.util.Objects;

public class Line<T extends AbstractPoint<?>> {
    private T firstPoint;
    private T secondPoint;

    public Line(T firstPoint, T secondPoint) {
        if (firstPoint == null || secondPoint == null)
            throw new IllegalArgumentException();
        setFirstPoint(firstPoint);
        setSecondPoint(secondPoint);
    }

    public Double length() {
        return firstPoint.distanceTo(secondPoint);
    }

    public void setFirstPoint(T firstPoint) {
        this.firstPoint = (T) firstPoint.clone();
    }


    public void setSecondPoint(T secondPoint) {
        this.secondPoint = (T) secondPoint.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line<?> line = (Line<?>) o;
        return Objects.equals(firstPoint, line.firstPoint) && Objects.equals(secondPoint, line.secondPoint)
                || Objects.equals(secondPoint, line.firstPoint) && Objects.equals(firstPoint, line.secondPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPoint) + Objects.hash(secondPoint);
    }
}
