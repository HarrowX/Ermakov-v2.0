package xyz.alexandrit.math.geometry.points;

public non-sealed class Point2D<T extends Number> extends AbstractPoint<T> {

    public Point2D(T x, T y) {
        super(x, y);
    }
    public Point2D(Point2D<T> other){
        super(other.x(), other.y());
    }
    T x() {
        return get(0);
    }
    T y() {
        return get(1);
    }

    public Point2D<T> clone() {
        return new Point2D<>(x(), y());
    }

    @Override
    public Double distanceTo(AbstractPoint<?> other) {
        return distanceTo((Point2D<T>)other);
    }
    public Double distanceTo(Point2D<T> other) {
        return Math.sqrt((this.x().doubleValue() - other.x().doubleValue())*(this.x().doubleValue() - other.x().doubleValue())
                 + (this.y().doubleValue() - other.y().doubleValue())*(this.y().doubleValue() - other.y().doubleValue()));
    }

    public Point2D<T> moveTo(T x, T y) {
        return new Point2D<>(x, y);
    }
}
