package xyz.alexandrit.students;

import lombok.Getter;
import lombok.NonNull;
import xyz.alexandrit.students.exceptions.IllegalNameException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    @Getter @NonNull
    private String name;
    private MarkRule rule = new MarkFrom2To5Rule();

    private final List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this(name,new int[0]);
    }
    public Student(String name, int... marks){
        if (name.isBlank()) throw new IllegalNameException("name must be not empty");
        this.name = name;
        for (int mark : marks) {
            addMark(mark);
        }
    }
    public void addMark(int mark) {
        checkMark(mark);
        this.marks.add(mark);
    }
    public void addMarks(Integer... marks) {
        Arrays.stream(marks).toList().forEach(this::checkMark);
        this.marks.addAll(Arrays.stream(marks).toList());
    }
    private void checkMark(Integer mark) {
        rule.checkMark(mark);
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    public double getAvgMarks() {
        if (marks.isEmpty()) {
            return 0;
        }
        double avg = 0;
        for (Integer mark : marks) {
            avg += mark;
        }
        avg /= marks.size();
        return avg;
    }
    public boolean isExcellent() {
        return Math.round(getAvgMarks()) == 5;
    }

    @Override
    public String toString() {
        return STR."\{name}: \{marks}";
    }

}
