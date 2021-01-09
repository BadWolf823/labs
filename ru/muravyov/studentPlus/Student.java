package ru.muravyov.studentPlus;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class Main{
    public static void main(String[] args) {
        ExamMark<Integer> examMark = new ExamMark<>(4,x->x);
        List<RegularMark> regularMarks = new ArrayList<>(List.of(
                new RegularMark(2,x->x),
                new RegularMark(3, x->x),
                new RegularMark(5, x->x)));
        List<RegularMark> regularMarks1 = new ArrayList<>(List.of(
                new RegularMark(4,x->x),
                new RegularMark(4, x->x),
                new RegularMark(3, x->x)));
        List<DisciplineMark> disciplineMarks = new ArrayList<>(List.of(
                new DisciplineMark("Math",examMark,regularMarks),
                new DisciplineMark("History",examMark,regularMarks1)
        ));

        StudentMark studentMark = new StudentMark(disciplineMarks);

        Student st = new Student("Vasia",studentMark);

        Visitor visitor = new MarkVisitor();
        for (var mark : studentMark){
            mark.accept(visitor);
        }
        System.out.println("--- EDIT ---");
        st.addMark("Math",5);
        st.addMark("Info", 9);
        st.setExamMark("Math", 3);

        for (var mark : studentMark){
            mark.accept(visitor);
        }
    }
}

interface Visitor{
    void visit(StudentMark mark);
    void visit(ExamMark mark);
    void visit(DisciplineMark mark);
    void visit(RegularMark mark);
}

class MarkVisitor implements Visitor{

    @Override
    public void visit(StudentMark mark) {
        System.out.println("StudentMark:" + mark.getMarkToNumber());
    }

    @Override
    public void visit(ExamMark mark) {
        System.out.println("ExamMark:" + ((mark == null)?0:mark.getMarkToNumber()));
    }

    @Override
    public void visit(DisciplineMark mark) {
        System.out.println("DisciplineMark:" + mark.getMarkToNumber());
    }

    @Override
    public void visit(RegularMark mark) {
        System.out.println("RegularMark:" + mark.getMarkToNumber());
    }
}

class Student {
    public String name;
    public StudentMark mark;
    private University university;

    public Student(String name, StudentMark mark) {
        this.name = name;
        this.mark = mark;
    }

    public void addMark(String discipline, int mark){
        DisciplineMark disciplineMark =
                this.mark.disciplineMarks.stream().filter(x->x.name.equals(discipline)).findFirst().orElse(null);
        if (disciplineMark != null) disciplineMark.regularMarks.add(new RegularMark(mark, x->x));
    }

    public void setExamMark(String discipline, int mark){
        DisciplineMark disciplineMark =
                this.mark.disciplineMarks.stream().filter(x->x.name.equals(discipline)).findFirst().orElse(null);
        if (disciplineMark != null) disciplineMark.examMark = new ExamMark(mark, x->x);
    }

    public University getUniversity(){
        return (university == null)?(university = new University("SSTU", new ArrayList<>())):university;
    }
}

class University{
    public String name;
    public List<Student> activeList;

    public University(String name, List<Student> activeList) {
        this.name = name;
        this.activeList = activeList;
    }

    public String getAward(Student st){
        if (st.mark.getMarkToNumber() == 5) return "Грамота";
        if (activeList.contains(st))
        return "";
    }
}

abstract class AwardRule{
    protected AwardRule next;
    public abstract String getAward(Student st);
}

class ActivityRule extends AwardRule{
    public University university;

    public ActivityRule(University university) {
        this.university = university;
    }

    @Override
    public String getAward(Student st) {
        return "Благодарность";
    }
}


class StudentMark implements Mark, Iterable<Mark>{
    public List<DisciplineMark> disciplineMarks;

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

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public Iterator<Mark> iterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator<Mark>{
        private int i = 0;
        private Iterator<Mark> presentIterator =  disciplineMarks.get(0).iterator();
        @Override
        public boolean hasNext() {
            return (i < 2 * disciplineMarks.size() - 1)||(presentIterator.hasNext());
        }

        @Override
        public Mark next() {
            if (i < disciplineMarks.size())
                return disciplineMarks.get(i++);
            if (!presentIterator.hasNext()) presentIterator = disciplineMarks.get(++i - disciplineMarks.size()).iterator();
            return presentIterator.next();
        }
    }
}

class ExamMark<T> implements Mark {
    public T mark;
    public Function<T, Integer> functionMap;

    public ExamMark(T mark, Function<T, Integer> function) {
        this.mark = mark;
        this.functionMap = function;
    }

    @Override
    public int getMarkToNumber() {
        return functionMap.apply(mark);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}

class DisciplineMark implements Mark, Iterable<Mark>{
    public ExamMark examMark;
    public List<RegularMark> regularMarks;
    public String name;
    public DisciplineMark(String name, ExamMark examMark,
                          List<RegularMark> regularMarks) {
        this.examMark = examMark;
        this.regularMarks = regularMarks;
        this.name = name;
    }

    @Override
    public int getMarkToNumber() {
        double number = (examMark != null)?examMark.getMarkToNumber():regularMarks.stream()
                .mapToInt(x->x.getMarkToNumber()).average().orElse(0.);
        return (int)Math.round(number);
    }

    @Override
    public Iterator<Mark> iterator() {
        return new DisciplineIterator();
    }
    private class DisciplineIterator implements Iterator<Mark>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < regularMarks.size() + 1;
        }

        @Override
        public Mark next() {
            if (index == 0){
                index++;
                return examMark;
            }
            return regularMarks.get(index++ - 1);
        }
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}

class RegularMark<T> implements Mark{
    public T mark;
    public Function<T, Integer> functionMap;

    public RegularMark(T mark, Function<T, Integer> function) {
        this.mark = mark;
        this.functionMap = function;
    }

    @Override
    public int getMarkToNumber() {
        return functionMap.apply(mark);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}

interface Mark {
    int getMarkToNumber();
    void accept(Visitor v);
}
