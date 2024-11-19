package xyz.alexandrit.students.exceptions;

public class IllegalMarkException extends IllegalArgumentException{
    private int x;
    public IllegalMarkException(String s) {
        super(s);
    }
    private IllegalMarkException(int x, int a, int b) {
        super(STR."mark \{x} must be in range [\{a}, \{b}]");
        this.x = x;
    }
    public IllegalMarkException(int x) {
        this(x, 1, 5);
    }
}
