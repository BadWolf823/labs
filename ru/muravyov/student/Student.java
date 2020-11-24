/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author muravyovas
 */
public class Student<T> {

    String name;
    private final List<T> marks = new ArrayList<>();
    Predicate<T> border;

    public Student(String name, Predicate<T> border){
        this(name, border, null);
    }

    public Student(String name,Predicate<T> border, T ... marks){
        this.name = name;
        this.border = border;
        if (marks != null){
            for (int i = 0; i < marks.length; i++){
                this.addMark(marks[i]);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ":" + this.marks;
    }

/*
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
*/
    public List<T> getMarks(){
        return new ArrayList<>(this.marks);
    }

    public void addMark(T mark){
        if (border.test(mark)) this.marks.add(mark);
    }
}




