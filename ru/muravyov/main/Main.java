package ru.muravyov.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("B",List.of(2,3,4));
        Student student1 = new Student("C", List.of(5,3));
        Student student2 = new Student("D");
        Report report = new Report(student, student1, student2);
        report.print();
    }
}

class Student implements Observable, Cloneable{
    private String name;
    private List<Integer> marks = new ArrayList<>();
    private List<Observer> list = new ArrayList<>();

    public Student(String name, List<Integer> marks,List<Observer> list) {
        this.name = name;
        if (list != null) this.list.addAll(list);
        for (var mark : marks) {
            this.addMark(mark);
        }
    }

    public Student(String name, List<Integer> marks) {
        this(name, marks, null);
    }

    public Student(String name) {
        this (name, new ArrayList<>(), null);
    }

    public void addMark(int mark){
        if ((mark >= 2)&&(mark <= 5)) marks.add(mark);
        list.forEach(x-> x.notify(mark));
    }

    public void remMark(int mark){
        list.remove(mark);
    }

    public void editMark(int indexOldMark, int mark){
        marks.set(indexOldMark, mark);
    }

    public String getName() {
        return name;
    }
    public Integer[] getMarks(){
        return marks.toArray(new Integer[marks.size()]);
    }

    @Override
    public void addListener(Observer listener){
        list.add(listener);
    }

    @Override
    public void removeListener(Observer listener){
        list.remove(listener);
    }

    @Override
    public Observer[] getObservers() {
        return list.toArray(new Observer[list.size()]);
    }

    @Override
    public Student clone(){
        Student st;
        try{
            st = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            st = null;
        }
        st.marks = new ArrayList<>(marks);
        return st;
    }
}

class Parent implements Observer{
    @Override
    public void notify(int mark){
        if (mark == 2) System.out.println("Плохо");
        else if (mark == 3) System.out.println("Не хорошо");
        else if (mark == 4) System.out.println("Хорошо");
        else if (mark == 5) System.out.println("Отлично");
    }
}

interface Observer{
    void notify(int mark);
}

interface Observable{
    void addListener(Observer listener);
    void removeListener(Observer listener);
    Observer[] getObservers();
}

class Report{
    List<Student> studentList;
    Report(Student ... students){
        studentList = Arrays.asList(students);
    }
    public void print(){
        for (var student : studentList){
            System.out.println(student.getName() + ':' + Arrays.toString(student.getMarks()));
        }
    }
    public void removeMark(int indexStudent, int mark){
        studentList.get(indexStudent).remMark(mark);
    }
    public void addMark(int indexStudent, int mark){
        studentList.get(indexStudent).addMark(mark);
    }
    public void editMark(int indexStudent, int indexOldMark, int newMark){
        studentList.get(indexStudent).editMark(indexOldMark, newMark);
    }
    public List<Student> save(){
        List<Student> cloneStudents = List.copyOf(List.of());
        studentList.forEach(st->st = st.clone());
        return cloneStudents;
    }
    public void restore(List<Student> studentList){
        this.studentList = studentList;
    }
}



