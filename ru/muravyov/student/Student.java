/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Student {

    String name;
    private final List<Integer> marks = new ArrayList<>();

    Student(String name) throws Exception {
        this(name, null);
    }

    Student(String name, int... marks) throws Exception {
        this.name = name;
        if (marks != null){
            for (int i = 0; i < marks.length; i++){
                if ((marks[i] < 2)||(marks[i] > 5)) throw new Exception("Unsupported mark");
                this.marks.add(marks[i]);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ":" + this.marks;
    }

    public double getAverage() {
        if (marks.size() == 0) {
            return 0.;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }
    
    public boolean isExcellent(){
        for (int mark : marks) {
            if (mark != 5) return false;
        }
        return true;
    }

    public Integer[] getMarks(){
        return this.marks.toArray(marks.toArray(new Integer[0]));
    }

    public void addMarks(int mark){
        if ((mark < 2)||(mark > 5)) throw new IllegalArgumentException("Unsupported mark");
        this.marks.add(mark);
    }
}
