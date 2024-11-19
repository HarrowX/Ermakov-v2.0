package xyz.alexandrit.math.geometry.points;

public non-sealed class Point3D<T extends Number> extends AbstractPoint<T> {
    public Point3D(T x, T y, T z) {
        super(x, y, z);
    }
    T x() {
        return coordinates.getValues().get(0);
    }
    T y() {
        return coordinates.getValues().get(1);
    }
    T z() {
        return coordinates.getValues().get(1);
    }

    public Point3D<T> moveTo(T x, T y, T z) {
        return new Point3D<>(x, y, z);
    }

    @Override
    public Object clone() {
        return new Point3D<>(x(), y(), z());
    }

    @Override
    public Double distanceTo(AbstractPoint<?> other) {
        return distanceTo((Point3D<?>) other);
    }
    public Double distanceTo(Point3D<?> other) {
        return Math.sqrt((this.x().doubleValue() - other.x().doubleValue())*(this.x().doubleValue() - other.x().doubleValue())
                + (this.y().doubleValue() - other.y().doubleValue())*(this.y().doubleValue() - other.y().doubleValue())
                + (this.z().doubleValue() - other.z().doubleValue())*(this.z().doubleValue() - other.z().doubleValue()));

    }
}
