package xyz.alexandrit.students;

import xyz.alexandrit.students.exceptions.IllegalMarkException;

public class MarkFrom2To5Rule extends MarkRule{
    @Override
    public void checkMark(Integer mark) {
        if(mark < 2 || mark > 5) throw new IllegalMarkException("Mark must be 2, 3, 4 or 5");
    }
}
