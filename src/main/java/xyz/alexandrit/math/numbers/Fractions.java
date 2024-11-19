package xyz.alexandrit.math.numbers;
public final class Fractions extends Number {
    private int numerator;
    private int denominator;
    public Fractions(int numerator, int denominator) {
        if (numerator == 0 && denominator == 0) {
            throw new ArithmeticException("0 / 0");
        }
        int gcd = gcd(numerator, denominator);
        if (denominator < 0) {
            numerator = - numerator;
            denominator = -denominator;
        }
        if (gcd < 0) {
            gcd = -gcd;
        }
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    public Fractions(int numerator) {
        this(numerator, 1);
    }
    private int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public Fractions sum(Fractions other) {
        return new Fractions(numerator * other.denominator + denominator * other.numerator,
                denominator * other.denominator);
    }
    public Fractions negative(Fractions other) {
        return new Fractions(-numerator, denominator);
    }
    public Fractions minus(Fractions other) {
        return sum(negative(other));
    }
    public Fractions minus(int other) {
        return sum(negative(new Fractions(other)));
    }
    public Fractions div(Fractions other) {
        return new Fractions(numerator * other.denominator,
                denominator * other.numerator);
    }
    public Fractions multiply(Fractions other) {
        return new Fractions(numerator * other.numerator,
                denominator * other.denominator);
    }

    @Override
    public String toString() {
        if (numerator == 0) return "0";
        if (denominator == 1) return STR."\{numerator}";
        if (denominator != 0) return STR."\{numerator}/\{denominator}";
        if (numerator > 0) return String.valueOf(Double.POSITIVE_INFINITY);
        return String.valueOf(Double.NEGATIVE_INFINITY);
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double)numerator/denominator;
    }
}
