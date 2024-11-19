package xyz.alexandrit.students.exceptions;

public class IllegalNameException extends IllegalArgumentException{
    public IllegalNameException(String s) {
        super(s);
    }
}
