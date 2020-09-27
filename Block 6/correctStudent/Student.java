/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctStudent;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Student {

    String name;
    private int[] appraisals;

    Student(String name) throws Exception {
        this(name, null);
    }

    Student(String name, int... appraisals) throws Exception {
        this.name = name;
        if (appraisals != null){
            this.appraisals = new int[appraisals.length];
            for (int i = 0; i < appraisals.length; i++){
                if ((appraisals[i] < 2)||(appraisals[i] > 5)) throw new Exception("Unsupported mark");
                this.appraisals[i]= appraisals[i];
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ":" + Arrays.toString(this.appraisals);
    }

    public double getAverage() {
        if ((appraisals == null)||(appraisals.length == 0)) {
            return 0.;
        }
        int sum = 0;
        for (int appraisal : appraisals) {
            sum += appraisal;
        }
        return (double) sum / appraisals.length;
    }
    
    public boolean isExcellent(){
        if ((appraisals == null)) return false;
        for (int appraisal : appraisals) {
            if (appraisal != 5) return false;
        }
        return true;
    }
}
