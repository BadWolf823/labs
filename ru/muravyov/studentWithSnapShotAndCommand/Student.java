package ru.muravyov.studentWithSnapShotAndCommand;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Student implements Reactable {

    private String name;
    private List<Integer> marks = new ArrayList();
    private List<MarkReactable> toReact = new ArrayList<MarkReactable>();

    public Student(String name, Parent parent) {
        this.name = name;
        if (parent == null) {
            throw new IllegalArgumentException("parent must be");
        }
        toReact.add(parent);
    }

    public Student(Student std) {
        std.name = this.name;
        std.marks = new ArrayList(marks);
        std.toReact = new ArrayList(toReact);
    }

    public int addMark(int m) {
        if (m < 2 && m > 5) {
            throw new IllegalArgumentException();
        }
        marks.add(m);
        for (MarkReactable tmp : toReact) {
            tmp.markReact(m);
        }
        return marks.size() - 1;
    }

    public void editMark(int i, int newM) {
        marks.set(i, newM);
    }

    public int getMark(int i) {
        return marks.get(i);
    }

    public void removeMark(int indexMark){
        marks.remove(marks.indexOf(indexMark));
    }

    public List<Integer> getMarks() {
        return new ArrayList(marks);
    }

    public void addReact(MarkReactable smth) {
        toReact.add(smth);
    }

    public MarkReactable removeReact(MarkReactable smth) {
        return toReact.remove(toReact.indexOf(smth));
    }

    @Override
    public String toString() {
        return name + ": " + marks + "\n";
    }

}

class Parent implements MarkReactable {

    public void markReact(int mark) {
        if (mark == 5) {
            System.out.println("very OK");
            return;
        }
        if (mark == 4) {
            System.out.println("OK");
            return;
        }
        if (mark == 3){
            System.out.println("Bad");
            return;
        }
        if (mark == 2){
            System.out.println("very bad");
        }
    }
}

interface MarkReactable {

    public void markReact(int mark);
}

interface Reactable {

    public void addReact(MarkReactable smth);

    public MarkReactable removeReact(MarkReactable smth);
}

class Report implements ReStorable {

    private Deque<Command> commands = new LinkedList<>();
    private Deque<Command> commandsCanceled = new LinkedList<>();

    List<Student> list = new ArrayList<Student>();

    public void addStudent(Student std) {
        list.add(std);
    }

    public Student removeStudent(Student std) {
        return list.remove(list.indexOf(std));
    }

    public void addMark(int indedxOfS, int mark){
        Command command = new AddMarkCommand(this,indedxOfS,mark);
        command.execute();
        commands.push(command);
        commandsCanceled.clear();
    }

    public void editMark(int indexOfM, int indexOfS, int newMark) {
        list.get(indexOfS).editMark(indexOfM, newMark);
    }

    public void print() {
        System.out.println(list);
    }

    public void cancelLastCommand(){
        Command command;
        if ((command = commands.pop()) == null) return;
        commandsCanceled.push(command);
        command.cancel();
    }

    @Override
    public Snapshot save() {
        Report toSave = new Report();
        list.forEach(t -> {
            toSave.addStudent(new Student(t));
        });
        return new Snapshot(toSave);
    }

    @Override
    public void restore(Snapshot snapshot) {
        Report tmp = snapshot.storedReport;
        this.list = new ArrayList<>();
        tmp.list.forEach(s -> {
            this.list.add(new Student(s));
        });
    }

}

class AddMarkCommand implements Command{
    private Report report;
    private Student student;
    private int mark;
    int indexMark;

    public AddMarkCommand(Report report, int indexOfS, int mark) {
        this.report = report;
        this.student = report.list.get(indexOfS);
        this.mark = mark;
    }

    @Override
    public void execute() {
        indexMark = student.addMark(mark);
    }

    @Override
    public void cancel() {
        student.removeMark(indexMark);
    }
}

interface Command{

    void execute();

    void cancel();

}

interface ReStorable {

    Snapshot save();

    void restore(Snapshot snapshot);

}

class Snapshot {

    Report storedReport;

    public Snapshot(Report storedReport) {
        this.storedReport = storedReport;
    }

}
