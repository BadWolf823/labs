package ru.muravyov.studentPlus;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Student {
    String name;
    List<DisciplineMark> marks;

    public Student(String name, List<DisciplineMark> marks) {
        this.name = name;
        this.marks = marks;
    }
}

class StudentMark implements Mark {
    private List<DisciplineMark> disciplineMarks;

    public StudentMark(List<DisciplineMark> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    @Override
    public int getMarkToNumber() {
        return disciplineMarks.stream()
                .mapToInt(x -> x.getMarkToNumber())
                .min()
                .orElse(0);
    }
}

class ExamMark<T> implements Mark {
    private T mark;
    Function<T, Integer> functionMap;

    public ExamMark(T mark, Function<T, Integer> function) {
        this.mark = mark;
        this.functionMap = function;
    }

    @Override
    public int getMarkToNumber() {
        return functionMap.apply(mark);
    }
}

class DisciplineMark implements Mark {
    private ExamMark examMark;
    private List<RegularMark> regularMarks;
    private BiFunction<ExamMark, List<RegularMark>, Integer> functionMap;

    public DisciplineMark(ExamMark examMark,
                          List<RegularMark> regularMarks,
                          BiFunction<ExamMark, List<RegularMark>, Integer> functionMap) {
        this.examMark = examMark;
        this.regularMarks = regularMarks;
        this.functionMap = functionMap;
    }

    @Override
    public int getMarkToNumber() {
        return functionMap.apply(examMark, regularMarks);
    }
}

class RegularMark<T> implements Mark {
    private T mark;
    Function<T, Integer> functionMap;

    public RegularMark(T mark, Function<T, Integer> function) {
        this.mark = mark;
        this.functionMap = function;
    }

    @Override
    public int getMarkToNumber() {
        return functionMap.apply(mark);
    }
}

interface Mark {
    int getMarkToNumber();
}
